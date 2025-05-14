package com.brunols.to_do.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponseDTO {

    private Long id;
    private String title;
    private String description;
    private Boolean completed;

}
