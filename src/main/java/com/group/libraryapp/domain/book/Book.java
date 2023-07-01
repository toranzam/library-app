package com.group.libraryapp.domain.book;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @Column(nullable = true)
    private String name;

    public String getName() {
        return name;
    }

    public Book(){

    }

    public Book(String name) {
        if(name == null || name.isBlank())
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다."));
        this.name = name;
    }
}
