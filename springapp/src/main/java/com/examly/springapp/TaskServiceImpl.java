/*
 *-----------------------------------------------------------------------------
 * Copyright 2023 NCR Corporation
 *-----------------------------------------------------------------------------
 */
package com.examly.springapp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> fetchTaskList() {
        return (List<Task>) taskRepository.findAll();
    }

    public void deleteTaskById(Long taskId) {
        taskRepository.deleteById(taskId);
    }

    public Task getTaskById(Long id) {
        Optional<Task> task = taskRepository.findById(id);
        if (task.isPresent()) {
            return task.get();
        }
        return null;
    }

}
