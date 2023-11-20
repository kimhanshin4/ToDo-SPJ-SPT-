package com.sprata.todo.service;

import com.sprata.todo.dto.*;
import com.sprata.todo.entity.*;
import com.sprata.todo.jwt.*;
import com.sprata.todo.repository.*;
import com.sprata.todo.security.*;
import java.util.*;
import lombok.*;
import org.springframework.security.core.*;
import org.springframework.security.core.context.*;
import org.springframework.stereotype.*;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentJpaRepository commentJpaRepository;
    private final JwtUtil jwtUtil;

    //    public CommentResponseDto addComment(CommentRequestDto requestDto, @AuthenticationPrincipal
//    UserDetailsImpl userDetails) {
//        if (jwtUtil.token) {
//            Todo comment = new Comment(requestDto);
//        }
//        Todo saveComment = commentJpaRepository.save(comment);
//        return new CommentResponseDto(saveComment);
//    }
//    public CommentResponseDto addComment(CommentRequestDto requestDto) {
//        // 현재 사용자의 Authentication 객체 가져오기
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        // Authentication이 UserDetailsImpl을 가지고 있으면서, Token이 유효한지 확인
//        if (authentication != null && authentication.getPrincipal() instanceof UserDetailsImpl) {
//            UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
//
//            // 여기서 유효성 검사 및 Comment 작성 로직 수행
//            if (isTokenValid(userDetails)) {
//                Comment comment = new Comment(requestDto, userDetails.getUser());
//                Comment savedComment = commentJpaRepository.save(comment);
//                return new CommentResponseDto(savedComment);
//            }
//        }
//
//        // 유효한 토큰이 없는 경우 또는 다른 예외적인 상황 처리
//        throw new RuntimeException("유효한 토큰이 없거나 만료되었습니다. Comment를 작성할 수 없습니다.");
//    }

    public List<CommentResponseDto> getComments(User user) {
        List<Comment> folderList = commentJpaRepository.findAllByUser(user);
        List<CommentResponseDto> responseDtoList = new ArrayList<>();

        for (Comment comment : folderList) {
            responseDtoList.add(new CommentResponseDto(comment));
        }
        return responseDtoList;
    }
//    public TodoResponseDto addComment(CommentAddRequestDto requestDto) {
//        Comment comment = new Comment(requestDto);
//        Comment saveComment = commentJpaRepository.save(comment);
//    }
}
