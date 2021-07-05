package com.example.stringbootapi.user;

import javax.persistence.*;

@Entity
@Table(name = "\"User\"")
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )

    @GeneratedValue (
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;
    private String firstname;
    private String lastname;
    private String userName;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(){

    }

    public User(Long id, String firstname, String lastname, String userName, Integer age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.userName = userName;
        this.age = age;
    }

    public User(String firstname, String lastname, String userName, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.userName = userName;
        this.age = age;
    }




}
