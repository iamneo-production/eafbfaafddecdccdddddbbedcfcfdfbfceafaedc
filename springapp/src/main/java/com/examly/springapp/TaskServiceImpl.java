/*
 *-----------------------------------------------------------------------------
 * Copyright 2023 NCR Corporation
 *-----------------------------------------------------------------------------
 */
package com.examly.springapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;
    
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

   
    public List<Task> fetchTaskList() {
        return null;
    }
    
    public void deleteTaskById(Long TaskId) {
        // TODO Auto-generated method stub
        
    }

}
