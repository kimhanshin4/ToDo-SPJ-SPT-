package com.sprata.todo.controller;

import com.sprata.todo.dto.*;
import com.sprata.todo.security.*;
import com.sprata.todo.service.*;
import java.util.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.security.core.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/vi")
public class CommentController {

    private final CommentService commentService;

//    @PostMapping("/comments")
//    public void addComments(@RequestBody CommentRequestDto requestDto, @AuthenticationPrincipal
//    UserDetailsImpl userDetails) {
//        CommentResponseDto responseDto = commentService.addComment(requestDto, userDetails);
//        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
//    }

    @GetMapping("/comments")
    public List<CommentResponseDto> getFolders(
        @AuthenticationPrincipal UserDetailsImpl userDetails) {
        return commentService.getComments(userDetails.getUser());
    }

}
