
package com.examly.springapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Annotation
@Repository
//Class
public interface TaskRepository extends CrudRepository<Task, Long> {
}  
 

