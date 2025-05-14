package com.brunols.to_do.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    private Long id;
    private String title;
    private String description;
    private Boolean completed;

    public Task(String description, String title) {
        this.description = description;
        this.title = title;
    }
}
