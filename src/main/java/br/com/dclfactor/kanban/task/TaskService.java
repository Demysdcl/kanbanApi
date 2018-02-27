package br.com.dclfactor.kanban.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public GroupingTask getLists() {
        List<Task> tasks = repository.findAll();
        final Map<StatusEnum, List<Task>> collect = tasks.stream()
                .collect(Collectors.groupingBy(Task::getStatus));
        return new GroupingTask(collect);
    }

}
