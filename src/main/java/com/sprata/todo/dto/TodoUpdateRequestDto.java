package com.sprata.todo.dto;

import lombok.*;

@Getter
public class TodoUpdateRequestDto {

    private String title;
    private String username;
    private String password;
    private String content;
}
