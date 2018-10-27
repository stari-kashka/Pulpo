package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "userRequest")
@Getter
@Setter
@ToString(of = {"id", "created", "removed", "deadline", "status", "isSecure", "topic", "author", "department", "performer"})
@EqualsAndHashCode(of = {"id"})
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column(updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime created;
    @Column(updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime removed;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime deadline;
    private String status;
    private Boolean isSecure;

    private String topic;
    private String author;
    private String department;
    private String performer;
}
