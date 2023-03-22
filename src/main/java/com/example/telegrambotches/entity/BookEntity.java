package com.example.telegrambotches.entity;

import lombok.*;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name ="books")
public class BookEntity {
    @Column(name = "book_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String title;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorEntity author;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "publishing_id")
    private PublisherEntity publisher;
    private int year;
    private String kind;

    @Override
    public String toString(){

        return "Название "+ title+'\n'+
                "Автор "+ author+'\n'+
                "Издательство "+ publisher+'\n'+
                "Год "+ year+'\n'+
                "Жанр "+ kind +'\n'+
                        '\n';
    }


}