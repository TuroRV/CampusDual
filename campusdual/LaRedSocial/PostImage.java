package com.campusdual.LaRedSocial;

import java.util.Date;

public class PostImage extends Post{

    protected String dimension;

    public PostImage(String postTitle, Date postDate, String dimension) {
        super();
        this.dimension = dimension;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Estos son tus post de imagen --> " +
                "Título de la imagen: " + postTitle + '\'' +
                " Tamaño de la imagen: " + dimension + '\'' +
                " Fecha de la imagen: " + postDate;
    }
}

