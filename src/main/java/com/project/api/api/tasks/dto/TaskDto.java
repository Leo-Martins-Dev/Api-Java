package com.project.api.api.tasks.dto;

import lombok.*;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {
   private Long id;
   private String title;
   private String description;
}



