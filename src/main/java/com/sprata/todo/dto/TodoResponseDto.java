package com.sprata.todo.dto;

import com.sprata.todo.entity.*;
import java.time.*;

public record TodoResponseDto(
    Long id,
    String title,
    String username,
    String content,
    LocalDateTime creatAt
) {

    public TodoResponseDto(Todo saveTodo) {
        this(
            saveTodo.getId(),
            saveTodo.getTitle(),
            saveTodo.getUsername(),
            saveTodo.getContent(),
            saveTodo.getCreatedAt()
        );
    }
}
