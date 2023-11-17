package com.sprata.todo.service;

import com.sprata.todo.dto.*;
import com.sprata.todo.entity.*;
import com.sprata.todo.repository.*;
import java.util.*;
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
}
