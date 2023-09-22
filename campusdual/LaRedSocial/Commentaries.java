package com.campusdual.LaRedSocial;

import java.util.Date;

public class Commentaries {

    protected String text;
    protected Date commentaryDate;
    protected User propietario;

    public Commentaries(String text, Date commentaryDate, User propietario) {
        this.text = text;
        this.commentaryDate = commentaryDate;
        this.propietario = propietario;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCommentaryDate() {
        return commentaryDate;
    }

    public void setCommentaryDate(Date commentaryDate) {
        this.commentaryDate = commentaryDate;
    }

    public User getPropietario() {
        return propietario;
    }

    public void setPropietario(User propietario) {
        this.propietario = propietario;
    }
}


