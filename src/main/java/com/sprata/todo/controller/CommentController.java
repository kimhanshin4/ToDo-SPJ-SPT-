package com.sprata.todo.controller;

import com.sprata.todo.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vi")
public class CommentController {

    private final CommentService commentService;
}
