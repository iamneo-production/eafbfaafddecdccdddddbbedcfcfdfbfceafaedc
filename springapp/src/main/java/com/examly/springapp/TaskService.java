/*
 *-----------------------------------------------------------------------------
 * Copyright 2023 NCR Corporation
 *-----------------------------------------------------------------------------
 */
package com.examly.springapp;

import java.util.List;

public interface TaskService {

    // save operation
    Task saveTask(Task Task);

    // read operation
    List<Task> fetchTaskList();

    // delete operation
    void deleteTaskById(Long TaskId);
}
