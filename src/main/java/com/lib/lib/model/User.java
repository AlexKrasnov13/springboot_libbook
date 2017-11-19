package com.lib.lib.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "USER")
public class User {
    private long userId;
    private String userName;
    private String userInfo;
    private List<Book> books;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "USER_NAME")
    @NotNull
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "USER_INFO")
    @NotNull
    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public List<Book> getBooks() {
        return books;
    }

    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="user")
    public void setBooks(List<Book> books) {
        this.books = books;
    }
}