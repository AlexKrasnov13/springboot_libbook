package com.lib.lib.model;

import javax.persistence.*;
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

    @Column(name = "PERSON_NAME")
    private String person_name;

    @Column(name = "PERSON_INFO")
    private String person_info;


    @OneToMany(mappedBy = "person")
    List<Book> books = new ArrayList<>();


    public long getPerson_id() {
        return id;
    }

    public void setPerson_id(long id) {
        this.id = id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getPerson_info() {
        return person_info;
    }

    public void setPerson_info(String person_info) {
        this.person_info = person_info;
    }
}
