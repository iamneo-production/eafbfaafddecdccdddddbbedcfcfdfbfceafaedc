package com.examly.springapp;
// Importing required classes
import com.examly.springapp.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
// Annotation
@Repository
// Class
public interface TaskRepository
    extends CrudRepository<Department, Long> {
}  
    

