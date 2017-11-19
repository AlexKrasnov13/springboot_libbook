package com.lib.lib.model;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "BOOK")
public class Book {

    private long book_id;
    private String book_title;
    private String book_author;
    private String book_description;
    private List<Image> images;
    private User user;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="USER_ID")

}
