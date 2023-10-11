package com.project.api.api.tasks.facade;

import com.project.api.api.tasks.dto.TaskDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskFacade {
    private static final Map<Long, TaskDto> tasks = new HashMap<>();

    public TaskDto create(TaskDto taskDto){
        Long nextId = tasks.keySet().size() +1L;
        taskDto.setId(nextId);
        tasks.put(nextId, taskDto);
        return taskDto;
    }

    public TaskDto update (TaskDto taskDto, Long taskId) {
        tasks.put(taskId, taskDto);
        return taskDto;
    }

    public TaskDto get (long taskId){
        return tasks.get(taskId);
    }

    public List<TaskDto> getAll (){
        return new ArrayList<>(tasks.values());
    }

    public String delete (Long taskId) {
        tasks.remove(taskId);
        return "Deleted";
    }


}
