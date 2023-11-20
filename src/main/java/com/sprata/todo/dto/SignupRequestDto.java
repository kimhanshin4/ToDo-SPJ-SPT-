package com.sprata.todo.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
public class SignupRequestDto {

    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @Email
    private String email;
    private boolean admin = false;
    private String adminToken = "";
}
