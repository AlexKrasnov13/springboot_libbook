package com.lib.lib.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "IMAGE")
public class Image {

    private long image_id;
    private byte[] image_data;
    private Integer image_length;
    private String image_type;
    private Book book;
}
