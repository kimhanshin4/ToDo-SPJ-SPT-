package com.sprata.todo.service;

import com.sprata.todo.dto.*;
import com.sprata.todo.entity.*;
import com.sprata.todo.repository.*;
import java.util.*;
import java.util.stream.*;
import lombok.*;
import org.springframework.stereotype.*;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoJpaRepository todoJpaRepository;

    public TodoResponseDto addTodo(TodoAddRequestDto requestDto) {
        // Dto -> Entity
        Todo todo = new Todo(requestDto);
        Todo saveTodo = todoJpaRepository.save(todo);
        return new TodoResponseDto(saveTodo);
    }

    public TodoResponseDto getTodo(Long postId) {
        Todo todo = todoJpaRepository.findById(postId)
            .orElseThrow(() -> new NullPointerException("해당 할 일을 찾을 수가 없어요!"));
        return new TodoResponseDto(todo);
    }

    public List<TodoResponseDto> getTodos() {
        return todoJpaRepository.findAllByOrderByCreatedAtDesc().stream()
            .map(TodoResponseDto::new)
            .collect(Collectors.toList());
    }
}
