package com.lib.lib.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "IMAGE")
public class Image implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    @Type(type="org.hibernate.type.BinaryType")
    @Column(name = "IMAGE_DATA")
    private byte[] data;

    @Column(name = "IMAGE_LENGTH")
    private Integer length;

    @Column(name = "IMAGE_TYPE")
    private String type;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BOOK_ID")
    private Book book;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
