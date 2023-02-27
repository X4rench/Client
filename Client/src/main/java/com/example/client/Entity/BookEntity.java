package com.example.client.Entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class BookEntity {
public Long id;
public String title;
public String author;
public String publisher;
public String year;
public String kind;

}
