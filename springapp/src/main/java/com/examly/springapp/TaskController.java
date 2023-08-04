/*
 *-----------------------------------------------------------------------------
 * Copyright 2023 NCR Corporation
 *-----------------------------------------------------------------------------
 */
package com.examly.springapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/saveTask")
    public Task saveTask(@RequestBody Task task) {
       
        return taskService.saveTask(task);
    }

    @GetMapping("/alltasks")
    public List<Task> fetchTasks() {

        return taskService.fetchTaskList();
    }

    @GetMapping("/getTask/{id}")
    public Task getTask(@PathVariable("id") Long id) {
        System.out.println(taskService.getTaskById(id));
        return taskService.getTaskById(id);
    }

    @GetMapping("/deleteTask/{id}")
    public void deleteTask(@PathVariable("id") Long id) {

        taskService.deleteTaskById(id);
    }
}
