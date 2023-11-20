package com.sprata.todo.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
public class SignupRequestDto {

    @NotBlank
    @Pattern(regexp = "^[a-z]{4,10}$")
    private String username;
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{8,15}$")
    private String password;
    @Email
    private String email;
    private boolean admin = false;
    private String adminToken = "";
}
