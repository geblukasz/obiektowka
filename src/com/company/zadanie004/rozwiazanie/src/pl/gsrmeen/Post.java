package com.company.zadanie004.rozwiazanie.src.pl.gsrmeen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post extends Entry {
    private List<Comment> comments;

    public Post(Date postedDate, User author, String content) {
        super(postedDate, author, content);
        comments = new ArrayList<>();
    }

    public List<Comment> getComments() {
        return comments;
    }
}
