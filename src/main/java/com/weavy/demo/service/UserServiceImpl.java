package com.weavy.demo.service;

import com.weavy.demo.dto.UserDTO;
import com.weavy.demo.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    @Override
    public UserEntity saveUser(UserDTO userDTO) {
        return null;
    }
}
