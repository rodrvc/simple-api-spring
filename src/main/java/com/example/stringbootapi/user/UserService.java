package com.example.stringbootapi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUser(){
        return userRepository.findAll();
    }

    public void createUser(User user)  {
        Optional<User> userByUserName = userRepository.findUserByUserName(user.getUserName());
        try {
            if (userByUserName.isPresent()){
                throw new IllegalAccessException("email taken");
            }
        }catch (IllegalAccessException e){
            return ;
        }
        userRepository.save(user);
    }

    public void deleteUser(Long userId) {
         boolean exists = userRepository.existsById(userId);

         try {
             if (!exists) {
                 throw new IllegalStateException("user with id " + userId + "does not exists!");
             }
         }catch (IllegalStateException e){
             return;
         }
         userRepository.deleteById(userId);
    }

    @Transactional
    public void updateUser(Long userId, String firstname, String lastname, Integer age) {


        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalStateException( "user with id " + userId + "does not exist"));

        if(firstname != null && firstname.length() > 0 ){
            user.setFirstname(firstname);
        }

        if (lastname != null && lastname.length() > 0){
            user.setLastname(lastname);
        }

//        if (age != null ){
//            user.setAge(age);
//        }
    }
}
