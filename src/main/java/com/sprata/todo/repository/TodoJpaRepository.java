package com.sprata.todo.repository;

import com.sprata.todo.entity.*;
import java.util.*;
import org.springframework.data.jpa.repository.*;

public interface TodoJpaRepository extends JpaRepository<Todo, Long> {


}
