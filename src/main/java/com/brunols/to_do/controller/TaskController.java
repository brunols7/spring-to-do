package com.brunols.to_do.controller;

import com.brunols.to_do.dto.TaskRequestDTO;
import com.brunols.to_do.dto.TaskResponseDTO;
import com.brunols.to_do.model.Task;
import com.brunols.to_do.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id){
        return ResponseEntity.ok(taskService.getTaskById(id));
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody TaskRequestDTO request){
        return ResponseEntity.ok(taskService.createTask(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody TaskRequestDTO request){
        return ResponseEntity.ok(taskService.updateTask(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<String> markAsCompleted(@PathVariable Long id){
        taskService.markAsCompleted(id);
        return ResponseEntity.ok("Task completed!");
    }
}