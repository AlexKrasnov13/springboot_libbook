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
    private byte[] image_data;

    @Column(name = "IMAGE_LENGTH")
    private Integer image_length;

    @Column(name = "IMAGE_TYPE")
    private String image_type;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BOOK_ID")
    private Book book;



    public long getImage_id() {
        return id;
    }

    public void setImage_id(long image_id) {
        this.id = id;
    }

    public byte[] getImage_data() {
        return image_data;
    }

    public void setImage_data(byte[] image_data) {
        this.image_data = image_data;
    }

    public Integer getImage_length() {
        return image_length;
    }

    public void setImage_length(Integer image_length) {
        this.image_length = image_length;
    }

    public String getImage_type() {
        return image_type;
    }

    public void setImage_type(String image_type) {
        this.image_type = image_type;
    }

}
