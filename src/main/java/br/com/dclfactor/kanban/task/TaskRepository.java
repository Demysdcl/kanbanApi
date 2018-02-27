package br.com.dclfactor.kanban.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(methods = {
    RequestMethod.POST,RequestMethod.PUT,
    RequestMethod.DELETE, RequestMethod.GET
})
public interface TaskRepository extends JpaRepository<Task, Long>{
}
