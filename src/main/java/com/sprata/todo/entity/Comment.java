package com.sprata.todo.entity;

import com.sprata.todo.dto.*;
import com.sprata.todo.security.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "comment")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@RequiredArgsConstructor
public class Comment extends TimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "title", nullable = false, length = 30)
    private String title;
    @Column(name = "username", nullable = false, length = 10)
    private String username;
    @Column(name = "contents", nullable = false, length = 500)
    private String content;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Comment(String title, String username, String content, User user) {
        this.title = title;
        this.username = username;
        this.content = content;
        this.user = user;
    }

    //public boolean tokenMatches
}
