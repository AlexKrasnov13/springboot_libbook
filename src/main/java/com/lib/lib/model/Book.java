package com.lib.lib.model;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "BOOK")
public class Book implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;


    @Column(name = "BOOK_TITLE")
    @NotNull
    private String title;

    @Column(name = "BOOK_AUTHOR")
    private String author;

    @Column(name = "BOOK_DESCRIPTION")
    @NotNull
    @Type(type = "text")
    private String description;

    @OneToMany(mappedBy = "book")
    private List<Image> imageList;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PERSON_ID")
    private Person person;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "person_role", joinColumns = @JoinColumn(name = "person_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
