package com.brunols.to_do.service;

import com.brunols.to_do.dto.TaskRequestDTO;
import com.brunols.to_do.dto.TaskResponseDTO;
import com.brunols.to_do.exceptions.TaskNotFoundException;
import com.brunols.to_do.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<Task>();
    private Long nextId = 1L;

    public List<Task> getAllTasks(){
        return tasks;
    }

    public Task getTaskById(Long id){
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new TaskNotFoundException());
    }

    public Task createTask(TaskRequestDTO request){
        Task task = new Task(nextId, request.getTitle(), request.getDescription(), false);
        tasks.add(task);
        nextId++;
        return task;
    }

    public Task updateTask(Long id, TaskRequestDTO request){
        Task task = getTaskById(id);
        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        return task;
    }

    public void deleteTask(Long id){
        Task task = getTaskById(id);
        tasks.remove(task);
    }

    public Task markAsCompleted(Long id){
        Task task = getTaskById(id);
        task.setCompleted(true);
        return task;
    }
}
