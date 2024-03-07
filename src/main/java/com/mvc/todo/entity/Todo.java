package com.mvc.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Todo {
    @Id
    private Long id;

    private String title;
    private boolean completed;
    private LocalDate createdDate;
    private LocalDate endDate;
}
