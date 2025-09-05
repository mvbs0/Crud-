package com.uninter.miguel.crudproject.modules.task.repository;

import com.uninter.miguel.crudproject.modules.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ITaskRepository extends JpaRepository<Task, Long> {
    Optional<Task> findById(Long id);

}