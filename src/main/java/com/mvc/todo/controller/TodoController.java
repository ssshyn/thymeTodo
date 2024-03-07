package com.mvc.todo.controller;

import com.mvc.todo.dto.TodoDto;
import com.mvc.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/todo")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping
    public List<TodoDto> getTodoList() {
        return todoService.getTodoList();
    }

    @PostMapping
    public Long saveTodo(@RequestBody TodoDto todoDto) {
        return todoService.saveTodo(todoDto);
    }
}
