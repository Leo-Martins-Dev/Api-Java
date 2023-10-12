package com.project.api.api.tasks.api;

import com.project.api.api.tasks.dto.TaskDto;
import com.project.api.api.tasks.facade.TaskFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/tasks", produces = MediaType.APPLICATION_JSON_VALUE)
public class TasksApi {
    @Autowired
    private TaskFacade taskFacade;

    @GetMapping("/{taskId}")
    @ResponseBody
    public TaskDto getTaskById(@PathVariable("taskId") Long taskId) {
        return taskFacade.get(taskId);
    }


    @PostMapping
    @ResponseBody
    public TaskDto create (@RequestBody TaskDto taskDto){
        return taskFacade.create(taskDto);
    }

    @PutMapping("/{taskId}")
    @ResponseBody
    public TaskDto update (@PathVariable("taskId") Long taskId, @RequestBody TaskDto taskDto) {
        return taskFacade.update(taskDto, taskId);
    }

    @DeleteMapping("/{taskId}")
    @ResponseBody
    public String delete (@PathVariable("taskId") long taskId){
        return taskFacade.delete(taskId);
    }

    @GetMapping
    @ResponseBody
    public List<TaskDto> getAll(){
        return taskFacade.getAll();
    }


}
