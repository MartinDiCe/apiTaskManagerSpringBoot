package com.mdice.apitaskmanager.service.dto;


import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Data
public class TaskInDTO {

    @Column(nullable = true, unique = true, length = 10)
    private String title;
    private String description;
    private LocalDateTime estimatedDate;
}
