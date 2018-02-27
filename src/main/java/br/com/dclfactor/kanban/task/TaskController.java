package br.com.dclfactor.kanban.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/list")
public class TaskController {

    @Autowired
    private TaskService service;

    @CrossOrigin
    @GetMapping
    public GroupingTask getList() {
        return service.getLists();
    }

}
