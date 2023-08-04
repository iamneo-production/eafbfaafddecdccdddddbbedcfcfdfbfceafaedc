package com.examly.springapp;
// Importing required classes
import com.amiya.springbootdemoproject.entity.Department;
import com.examl
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
// Annotation
@Repository
 
// Class
public interface TaskRepository
    extends CrudRepository<Department, Long> {
}  
    

