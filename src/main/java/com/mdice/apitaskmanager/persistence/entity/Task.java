package com.mdice.apitaskmanager.persistence.entity;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = true, unique = true, length = 10)
    private String title;
    private String description;
    private LocalDateTime createDate;
    private LocalDateTime estimatedDate;
    private LocalDateTime finalizationDate;
    private boolean completed;
    private TaskStatus taskStatus;

}
