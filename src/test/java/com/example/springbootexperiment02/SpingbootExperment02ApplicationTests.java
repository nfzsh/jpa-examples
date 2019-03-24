package com.example.springbootexperiment02;

import com.example.springbootexperiment02.repository.UserRepository;
import com.example.springbootexperiment02.entity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpingbootExperment02ApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Test
    public void addUserTest(){
        User user = new User("zsh");
        userRepository.addUser(user);
    }
    @Test
    public void addAddressTest(){
        Address address = new Address("NO.26");
        userRepository.addAddress(address,1);
    }
    @Test
    public void UpdateUserTest(){
        userRepository.updateUser(12, "admin");
    }
    @Test
    public void updateAddressTest(){
        userRepository.updateAddress(1, 12);
    }
}
