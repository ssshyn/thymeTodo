package com.mvc.todo.service;

import com.mvc.todo.dto.TodoDto;
import com.mvc.todo.entity.Todo;
import com.mvc.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TodoServiceImpl implements TodoService{
    private final TodoRepository todoRepository;

    @Override
    public Long saveTodo(TodoDto todoDto) {
        return todoRepository.save(TodoDto.toEntity(todoDto)).getId();
    }

    public List<TodoDto> getTodoList() {
        return todoRepository.findAll().stream().map(TodoDto::fromEntity).toList();
    }

    @Override
    public void completeTodo(Long id) {
        TodoDto updateTodo = todoRepository.findById(id).map(TodoDto::fromEntity).orElseThrow();
        updateTodo.setCompleted(!updateTodo.isCompleted());

        todoRepository.save(TodoDto.toEntity(updateTodo));
    }

    @Override
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
