package com.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Document("UserInfo")
public class UserInfo {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    //    CHANGE TO A LIST OF STRING.
    private String roles;
}
