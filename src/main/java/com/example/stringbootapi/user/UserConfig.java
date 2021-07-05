package com.example.stringbootapi.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args-> {
             User jorge = new User(
                     "jorge",
                     "Lopez",
                     "Jlopez",
                     5
             );

            User alex = new User(
                    "alex",
                    "Lopez",
                    "Jlopez",
                    5
            );

            repository.saveAll(
                    List.of(jorge , alex)
            );
        };
    }

}
