package com.sprata.todo.dto;

import lombok.*;

@Getter
@Setter
public class SignupRequestDto {

    private String username;
    private String password;
    private String email;
    private boolean admin = false;
    private String adminToken = "";
}
