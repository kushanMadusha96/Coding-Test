package com.weavy.demo.mapper;

import com.weavy.demo.dto.UserDTO;
import com.weavy.demo.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Mapping {
    private final ModelMapper mapper;

    public String convertBase64(String imagaeString) {
        return Base64.getEncoder().encodeToString(imagaeString.getBytes());
    }
    public UserDTO toUserDTO(UserEntity userEntity) {
        return mapper.map(userEntity, UserDTO.class);
    }

    public UserEntity toUserEntity(UserDTO userDTO) {
        return mapper.map(userDTO, UserEntity.class);
    }

}
