package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("task")
public class TaskController {

    @GetMapping()
    public List<Task> getTasks(){
        return List.of(
            new Task(1, "eat", false),
            new Task(2, "sleep", false),
            new Task(3, "code", true)
        );
    }
}
