package com.sprata.todo.dto;

import com.sprata.todo.entity.*;
import java.time.*;

public record CommentResponseDto(
    Long id,
    String title,
    String username,
    String content,
    LocalDateTime creatAt
) {

    public CommentResponseDto(Comment saveComment) {
        this(
            saveComment.getId(),
            saveComment.getTitle(),
            saveComment.getUsername(),
            saveComment.getContent(),
            saveComment.getCreatedAt()
        );
    }
}
