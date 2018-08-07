package com.kloud.gou.service;

import com.kloud.gou.entity.UserEntity;
import com.kloud.gou.model.User;
import com.kloud.gou.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers() {
        List<UserEntity> userEntityList = new ArrayList<>();
        userEntityList = userRepository.findAll();

        return userEntityList.stream().map(userEntity -> new User(userEntity.getUserId(), userEntity.getFirstName(), userEntity.getLastName(),userEntity.getEmail())
        ).collect(Collectors.toList());
    }
}
