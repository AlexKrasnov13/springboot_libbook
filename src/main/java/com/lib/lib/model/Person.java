package com.lib.lib.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PERSON")
public class Person implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Column(name = "password")
    @Length(min = 5, message = "*Your password must have at least 5 characters")
    @NotEmpty(message = "*Please provide your password")
    @Transient
    private String password;


    @Column(name = "PERSON_NAME")
    private String name;

    @Column(name = "PERSON_INFO")
    private String info;

    @Column(name = "PERSON_MAIL")
    private String mail;

    @OneToMany(mappedBy = "person")
    List<Book> books = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
