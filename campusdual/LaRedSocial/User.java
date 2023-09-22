package com.campusdual.LaRedSocial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {

    protected String name;

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    protected List<User> friends = new ArrayList<>();
    protected List<Post> myOwnPost = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

// Método borrar
    public void unfollowfriend (User friend){
        friends.remove(friend);
    }

    public void showFriendsList(){
        System.out.println(friends);
    }

    public void createPost (Post post){
        myOwnPost.add(post);
    }


    @Override
    public String toString() {
        return this.getName();
    }
}
