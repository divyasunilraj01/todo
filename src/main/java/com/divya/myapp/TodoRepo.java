package com.divya.myapp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface TodoRepo extends JpaRepository<Todo, Long> {

    @Transactional
    void deleteByDone(boolean done);
}
