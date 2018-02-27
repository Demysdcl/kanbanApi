package br.com.dclfactor.kanban.task;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class GroupingTask {

    List<Task> todoList;
    List<Task> doingList;
    List<Task> doneList;

    public GroupingTask(Map<StatusEnum, List<Task>> map) {
        todoList = map.get(StatusEnum.TODO);
        doingList = map.get(StatusEnum.DOING);
        doneList = map.get(StatusEnum.DONE);
    }
}
