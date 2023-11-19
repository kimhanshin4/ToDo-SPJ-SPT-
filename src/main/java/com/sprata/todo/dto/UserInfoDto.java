package com.sprata.todo.dto;

import lombok.*;

@Getter
@AllArgsConstructor
public class UserInfoDto {

    String username;
    boolean isAdmin;
}