package com.campusdual.LaRedSocial;

import com.campusdual.Utils;
import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    protected String postTitle;
    protected Date postDate = new Date();
    protected List<Commentaries> comentarios = new ArrayList<>();

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public Post() {
        this.postTitle = Utils.string("Introduce título: ");
        this.postDate = new Date();
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }



}
