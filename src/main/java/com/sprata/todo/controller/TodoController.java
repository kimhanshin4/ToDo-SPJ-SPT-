package com.sprata.todo.controller;

import com.sprata.todo.dto.*;
import com.sprata.todo.service.*;
import java.util.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/posts")
public class TodoController {

    private final TodoService todoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TodoResponseDto addTodo(
        @RequestBody TodoAddRequestDto requestDto) {
        TodoResponseDto responseDto = todoService.addTodo(requestDto);
        return responseDto;
    }

    @GetMapping("/{postId}")
    public TodoResponseDto getTodo(@PathVariable Long postId) {
        return todoService.getTodo(postId);
    }

    @GetMapping
    public List<TodoResponseDto> getTodos() {
        return todoService.getTodos();
    }
}
