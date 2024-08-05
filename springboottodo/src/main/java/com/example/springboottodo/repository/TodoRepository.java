package com.example.springboottodo.repository;

import com.example.springboottodo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Repositoryクラスであることを示す
public interface TodoRepository extends JpaRepository<Todo, Long> { 

}
