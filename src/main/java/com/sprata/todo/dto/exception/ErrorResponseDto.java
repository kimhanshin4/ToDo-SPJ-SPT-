package com.sprata.todo.dto.exception;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

@Getter
public class ErrorResponseDto {

    private final Error error;

    public ErrorResponseDto(int status, String msg) {
        this.error = new Error(status, msg);
    }

    @JsonPropertyOrder({"status", "message"})
    record Error(
        int status,
        @JsonProperty("message")
        String msg
    ) {

    }

}