package com.mvc.todo.controller;

import com.mvc.todo.dto.TodoDto;
import com.mvc.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/todo")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping
    public String getTodoList(Model model) {
        model.addAttribute("todoDto", new TodoDto());
        model.addAttribute("todoList", todoService.getTodoList());
        return "todo";
    }

    @PostMapping
    public String saveTodo(@ModelAttribute(value = "todoDto") TodoDto todoDto, Model model) {
        todoService.saveTodo(todoDto);
        model.addAttribute("todoDto", new TodoDto());
        model.addAttribute("todoList", todoService.getTodoList());
        return "todo";
    }

    @PostMapping("/{id}/update")
    public String updateTodo(@PathVariable(value = "id") Long id, Model model) {
        todoService.completeTodo(id);
        model.addAttribute("todoDto", new TodoDto());
        model.addAttribute("todoList", todoService.getTodoList());
        return "todo";
    }

    @PostMapping("/{id}/delete")
    public String deleteTodo(@PathVariable(value = "id") Long id, Model model) {
        todoService.deleteTodo(id);
        model.addAttribute("todoDto", new TodoDto());
        model.addAttribute("todoList", todoService.getTodoList());
        return "todo";
    }
}
