package com.lib.lib.model;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "BOOK")
public class Book implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;


    @Column(name = "BOOK_TITLE")
    @NotNull
    private String book_title;

    @Column(name = "BOOK_AUTHOR")
    private String book_author;

    @Column(name = "BOOK_DESCRIPTION")
    @NotNull
    @Type(type = "text")
    private String book_description;

    @OneToMany(mappedBy = "book")
    private List<Image> imageList;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PERSON_ID")
    private Person person;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_description() {
        return book_description;
    }

    public void setBook_description(String book_description) {
        this.book_description = book_description;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
