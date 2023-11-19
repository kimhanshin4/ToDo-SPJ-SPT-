package com.sprata.todo.controller;

import com.sprata.todo.controller.exception.*;
import com.sprata.todo.dto.*;
import com.sprata.todo.dto.exception.*;
import com.sprata.todo.service.*;
import java.util.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class TodoController {

    private final TodoService todoService;

    @PostMapping
    public ResponseEntity<TodoResponseDto> addTodo(
        @RequestBody TodoAddRequestDto requestDto) {
        TodoResponseDto responseDto = todoService.addTodo(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }

    @GetMapping("/posts/{postId}")
    public ResponseEntity<TodoResponseDto> getTodo(@PathVariable Long postId) {
        TodoResponseDto responseDto = todoService.getTodo(postId);
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping
    public ResponseEntity<List<TodoResponseDto>> getTodos() {
        List<TodoResponseDto> responseDtos = todoService.getTodos();
        return ResponseEntity.ok(responseDtos);
    }

    @PatchMapping("/posts/{postId}")
    public ResponseEntity<TodoResponseDto> updateTodo(@PathVariable Long postId,
        @RequestBody TodoUpdateRequestDto requestDto) {
        TodoResponseDto responseDto = todoService.updateTodo(postId, requestDto);
        return ResponseEntity.ok(responseDto);
    }

    @DeleteMapping("/posts/{postId}")
    public ResponseEntity<TodoResponseDto> deleteTodo(@PathVariable Long postId,
        @RequestHeader("password") String password) {
        todoService.deleteTodo(postId, password);
        return ResponseEntity.noContent().build();
    }

    @ExceptionHandler(PostNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> postNotFoundExceptionHandler(PostNotFoundException ex) {
        System.err.println(ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
            new ErrorResponseDto(
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage()
            )
        );
    }

    @ExceptionHandler(AuthorizeException.class)
    public ResponseEntity<ErrorResponseDto> AuthorizationExceptionHandler(
        AuthorizeException ex) {
        System.err.println(ex.getMessage());
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(
            new ErrorResponseDto(
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage()
            )
        );
    }
}
