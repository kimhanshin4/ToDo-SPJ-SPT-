package com.sprata.todo.repository;

import com.sprata.todo.entity.*;
import java.util.*;
import org.springframework.data.jpa.repository.*;

public interface CommentJpaRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByOrderByCreatedAtDesc();

    List<Comment> findAllByUser(User user);
}
