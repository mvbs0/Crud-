package com.uninter.miguel.crudproject.modules.task.usecase;

import com.uninter.miguel.crudproject.modules.task.entity.Task;
import com.uninter.miguel.crudproject.modules.task.repository.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskUseCase {
    @Autowired
    private ITaskRepository taskRepository;

    public Task findTaskById (Long id) {
        return taskRepository.findById(id).orElse(null);

    }
    public Task createTask(Task task){
        return taskRepository.save(task);

    }

    public List<Task> getList(){
        return taskRepository.findAll();
    }

    public Task updateTask(Long id, Task task){
        Task existingTask = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));

        existingTask.setName(task.getName());
        existingTask.setDate(task.getDate());
        existingTask.setResponsable(task.getResponsable());

        return taskRepository.save(existingTask);
    }
    public void deleteTask(Long id) {
        Task existingTask = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
        taskRepository.delete(existingTask);
    }

}