package com.example.telegrambotches.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@Table(name = "publishing")
public class PublisherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Издательство должно иметь имя")
    private String publisher;
    @NotBlank(message = "Издательство должно иметь адрес")
    private String city;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "publisher")
    private List<BookEntity> book;
}
