package com.campusdual.LaRedSocial;

import java.util.Date;

public class PostVideo extends Post{

        protected int quality;
        protected int duration;

    public PostVideo (String postTitle, Date postDate, int quality, int duration) {
        super();
        this.quality = quality;
        this.duration = duration;
    }

    public int getQuality() {
            return quality;
        }

        public void setQuality(int quality) {
            this.quality = quality;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

    @Override
    public String toString() {
        return "Estos son tus post de video --> " +
                "Título del video: " + postTitle + '\'' +
                " Fecha: " + postDate +
                " Calidad: " + quality +
                " Duración: " + duration;
    }
}

