package com.weavy.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShortUserEntity {
    @Id
    private String id;
    private String uid;
    private String display_name;
    private int directory_id;
    private String created_at;
}
