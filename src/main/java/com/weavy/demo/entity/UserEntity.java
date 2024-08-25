package com.weavy.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String uid;
    private String email;
    private String firstName;
    private String middleName;
    private String fullName;
    private String familyName;
    private String nickname;
    private String phoneNumber;
    private String comment;
    private String picture;
    private String directory;
    private Boolean isSuspended;
    private Boolean isBot;
}
