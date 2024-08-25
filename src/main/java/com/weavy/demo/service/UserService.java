package com.weavy.demo.service;

import com.weavy.demo.dto.UserDTO;
import com.weavy.demo.entity.UserEntity;

public interface UserService {
    UserEntity saveUser(UserDTO userDTO);
}
