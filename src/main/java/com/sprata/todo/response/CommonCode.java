package com.sprata.todo.response;

import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@Getter
public enum CommonCode {
    OK("회원 가입을 완료했습니다!", HttpStatus.OK.value());
    private final String message;
    private final Integer code;

    CommonCode(String message, Integer code) {
        this.message = message;
        this.code = code;
    }
}
