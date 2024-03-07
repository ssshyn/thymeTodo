package com.mvc.todo.service;

import com.mvc.todo.dto.TodoDto;

import java.util.List;

public interface TodoService {
    public Long saveTodo(TodoDto todoDto);
    public List<TodoDto> getTodoList();
}
