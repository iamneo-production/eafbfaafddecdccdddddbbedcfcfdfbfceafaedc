/*
 *-----------------------------------------------------------------------------
 * Copyright 2023 NCR Corporation
 *-----------------------------------------------------------------------------
 */
package com.examly.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TaskController {
    
    @Autowired private TaskService taskService;

    @PostMapping("/saveTask")
    public Task saveTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }
}
