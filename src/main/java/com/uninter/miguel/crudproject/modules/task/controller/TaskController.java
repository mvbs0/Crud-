package com.uninter.miguel.crudproject.modules.task.controller;

import com.uninter.miguel.crudproject.modules.task.entity.Task;
import com.uninter.miguel.crudproject.modules.task.usecase.TaskUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskUseCase useCase;

    @PostMapping("/")
    public ResponseEntity<Task> createTask(@RequestBody taskdto task){
        Task newTask= useCase.createTask(task);
        return ResponseEntity.ok(newTask);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskByID(@PathVariable Long id){
        Task newTask= useCase.findTaskById(id);
        return ResponseEntity.ok(newTask);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Task>> getList(){
        List<Task> listTask= useCase.getList();
        return ResponseEntity.ok(listTask);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task){
        Task updatedTask = useCase.updateTask(id, task);
        return ResponseEntity.ok(updatedTask);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        useCase.deleteTask(id);
        return ResponseEntity.noContent().build();
    }



}
