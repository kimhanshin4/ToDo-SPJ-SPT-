package com.sprata.todo.controller;

import com.sprata.todo.dto.*;
import com.sprata.todo.entity.*;
import com.sprata.todo.response.*;
import com.sprata.todo.security.*;
import com.sprata.todo.service.*;
import jakarta.validation.*;
import java.util.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.http.*;
import org.springframework.security.core.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;

@Slf4j

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;
    private final CommentService commentService;


    @PostMapping("/user/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> signup(@Valid @RequestBody SignupRequestDto requestDto) {
        userService.signup(requestDto);
        return ResponseEntity.ok(CommonCode.OK.getMessage());
    }

    @GetMapping("/user-comment")
    public String getUserInfo(Model model, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        model.addAttribute("comments", commentService.getComments(userDetails.getUser()));

        return "index :: #fragment";
    }
}