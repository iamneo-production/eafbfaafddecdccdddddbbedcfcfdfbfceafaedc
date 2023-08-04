/*
 *-----------------------------------------------------------------------------
 * Copyright 2023 NCR Corporation
 *-----------------------------------------------------------------------------
 */
package com.examly.springapp;

import java.util.List;

public interface TaskService {

    // save operation
    Task saveTask(Task task);

    // read operation
    List<Task> fetchTaskList();

    // delete operation
    void deleteTaskById(Long taskId);

    Task getTaskById(Long id);

}
