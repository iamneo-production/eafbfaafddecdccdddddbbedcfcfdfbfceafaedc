

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TaskController {
    
    @PostMapping("/saveTask")
	public Employee saveTask(@RequestBody Employee emp) {
		repository.store(emp);
		return emp;
	}
}
