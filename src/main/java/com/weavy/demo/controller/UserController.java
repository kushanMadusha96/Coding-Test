package com.weavy.demo.controller;

import com.weavy.demo.dto.UserDTO;
import com.weavy.demo.entity.ShortUserEntity;
import com.weavy.demo.entity.UserEntity;
import com.weavy.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private String weavyServerUrl = "https://cebd6c90858340f3a458f55f2c86946d.weavy.io";

    private String apiKey = "wys_JRqXS5wgYD1MqjdW7QxiXcnHPpDkR04FsAK6";

    private final RestTemplate restTemplate;
    private final UserService userService;


    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody UserDTO userDTO) {
        String url = weavyServerUrl + "/api/users";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + apiKey);
        headers.set("Content-Type", "application/json");

        HttpEntity<UserDTO> userEntity = new HttpEntity<>(userDTO, headers);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, userEntity, String.class);

        return ResponseEntity.status(response.getStatusCode()).body(response.getBody());

    }

    @GetMapping("/list")
    public ResponseEntity<List<ShortUserEntity>> getUsers() {
        String url = weavyServerUrl + "/api/users";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + apiKey);

        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<ShortUserEntity> response = restTemplate.exchange(
                url, HttpMethod.GET, requestEntity, ShortUserEntity.class);

        List<ShortUserEntity> users = Arrays.asList(response.getBody());
        return ResponseEntity.ok(users);
    }
}
