package com.example.telegrambotches.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@Table(name = "author")
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Имя не может быть пустым")
    private String name;
    @NotBlank(message = "Фамилия не может быть пустым")
    private String lastname;
    private String surname;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "author")
    private List<BookEntity> book;
}
