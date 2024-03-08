package com.mvc.todo.service;

import com.mvc.todo.dto.TodoDto;

import java.util.List;

public interface TodoService {
    Long saveTodo(TodoDto todoDto);
    List<TodoDto> getTodoList();

    void completeTodo(Long id);

    void deleteTodo(Long id);
}
