package com.mvc.todo.dto;

import com.mvc.todo.entity.Todo;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodoDto {
    private Long id;
    private String title;
    private boolean completed;
    private LocalDate createdDate;
    private LocalDate endDate;

    public static Todo toEntity(TodoDto response) {
        return Todo.builder()
                .id(response.id)
                .title(response.title)
                .completed(response.completed)
                .createdDate(response.createdDate)
                .endDate(response.endDate)
                .build();
    }

    public static TodoDto fromEntity(Todo entity) {
        return TodoDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .completed(entity.isCompleted())
                .createdDate(entity.getCreatedDate())
                .endDate(entity.getCreatedDate())
                .build();
    }
}
