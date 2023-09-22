package com.campusdual.LaRedSocial;
import com.campusdual.Utils;
import org.w3c.dom.ls.LSOutput;
import java.util.Arrays;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.time.*;

public class SocialMedia {
    private List<User> currentUsers = new ArrayList<>();
    private Map<User, List<Post>> uploadedPost = new HashMap<>();
    private Map <User, List<Commentaries>> uploadedComentaries = new HashMap<>();
    private User activeUser;
    public Map<User, List<Post>> getUploadedPost() {
        return uploadedPost;
    }
    public void setUploadedPost(Map<User, List<Post>> uploadedPost) {
        this.uploadedPost = uploadedPost;
    }
    public List<User> getCurrentUsers() {
        return currentUsers;
    }
    public User getActiveUser() {
        return activeUser;
    }
    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.populateSocialMedia();
        sm.init();
    }
    private void populateSocialMedia() {
        User u1 = new User("miguel");
        User u2 = new User("arturo");
        User u3 = new User("ruben");
        User u4 = new User("pablo");
        //Post p1 = new PostText("Mi primer post", new Date(),"Uo uo uo uo estoy en la red");
        //Post p2 = new PostText("Vacaciones de Verano", new Date(), "De vacaciones en Marbella con los Java Masters");
        //Post p3 = new PostVideo("Puesta de Sol", new Date(), 1080, 16  );
        //Post p4 = new PostImage ("JavaScripteando", new Date(),"850 x 1200" );
        // p5 = new PostText("Mi primer día en Java",new Date(), "Ayudenme por favor");
        //u1.createPost(p1);
        //u2.createPost(p2);
        //u4.createPost(p4);
        //u3.createPost(p3);
        //u3.createPost(p5);
        //this.uploadedPost.put(u1, new ArrayList<Post>());
        //this.uploadedPost.get(u1).add(p1);
        //this.uploadedPost.put(u2, new ArrayList<Post>());
        //this.uploadedPost.get(u2).add(p2);
        //this.uploadedPost.put(u3, new ArrayList<Post>());
        //this.uploadedPost.get(u3).add(p3);
        //this.uploadedPost.put(u4, new ArrayList<Post>());
        //this.uploadedPost.get(u4).add(p4);
        //this.uploadedPost.put(u3, new ArrayList<Post>());
        //this.uploadedPost.get(u3).add(p5);
        this.getCurrentUsers().add(u1);
        this.getCurrentUsers().add(u2);
        this.getCurrentUsers().add(u3);
        this.getCurrentUsers().add(u4);
    }
    private void init() {
        int option;
        do {
            System.out.println("=============================================");
            System.out.println("Bienvenido a la red social ~Java Masters~");
            System.out.println("=============================================");
            System.out.println(" ");
            System.out.println(" --- Pulsa 1 para Registrarte --- ");
            System.out.println(" --- Pulsa 2 para Iniciar sesión --- ");
            System.out.println(" --- Pulsa 0 para salir --- ");
            option = Utils.integer(" --> Seleccione opción: <-- ");
            System.out.println("==================================================");
            System.out.println(" ");
            switch (option) {
                case 1:
                    this.addUser();
                    break;
                case 2:
                    this.login();
                    break;
                default:
                    break;
            }
        } while (option != 0) ;
        System.out.println("Saliendo de la aplicación");
    }
    private void login() {
        System.out.println("Selecciona el usuario para entrar a la aplicación");
        List<User> users = Utils.showAndSelectFromList(this.currentUsers, false);
        if (!users.isEmpty()){
            this.setActiveUser(users.get(0));
        }
        this.loggedMenu();
    }
    private int loggedMenu() {
        int option;
        do {
            System.out.println("Hola " + this.getActiveUser().getName());
            System.out.println("Pulsa 2 para agregar un amigo");
            System.out.println("Pulsa 3 para eliminar un amigo");
            System.out.println("Pulsa 4 para ver tu lista de amigos");
            System.out.println("======================================");
            System.out.println("Pulsa 5 para publicar un Post");
            System.out.println("Pulsa 6 para ver los Post de ~Java Masters~");
            System.out.println("Pulsa 7 para ver tus Post publicados");
            System.out.println("=============================");
            System.out.println("Pulsa 8 para hacer un Comentario");
            System.out.println("Pulsa 9 para ver todos tus Comentarios");
            option = Utils.integer("¿Que vas a hacer hoy?: ");
            switch (option) {
                //Agregar Amigo
                case 2:
                    this.followFriend();
                    break;
                //Eliminar un amigo
                case 3:
                    this.unfollowFriend();
                    break;
                case 4:
                    this.listFriends();
                    //Comentar un Post
                    break;
                case 5:
                    this.postMenu();
                    break;
                case 6:
                    this.listPost();
                    break;
                case 7:
                    this.listmyPost();
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación");
                    break;
                default:
                    break;
            }
        }   while(option != 0);
        return option;
    }
    private int postMenu() {
        int option;
        do {
            System.out.println(" ");
            System.out.println("1. Postear un Texto");
            System.out.println(" ");
            System.out.println("2. Postear una Foto");
            System.out.println(" ");
            System.out.println("3. Postear un Video");
            System.out.println(" ");
            System.out.println("0. Volver al menú anterior");
            System.out.println(" ");
            option = Utils.integer("Elige el tipo de post: ");
            switch (option) {
                case 1: PostText p1 = new PostText();
                this.activeUser.createPost(p1);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    this.loggedMenu();
                    break;
                default:
                    break;
            }
        } while (option != 0);
        return option;
    }
    private void listFriends() {
        System.out.println(" ");
        System.out.println("Estos son las personas a las que sigues: ");
        Utils.showFromList(this.getActiveUser().getFriends(),false);
//2.- //        for(User u : this.getActiveUser().getFriends()){
//            System.out.println(u);
//        }
        //3.- // List<User> friendList = this.getActiveUser().getFriends();
//        for(int i = 0; i < friendList.size(); i ++){
//            System.out.println((i+1)+".- "+ friendList.get(i));
//        }
    }
    private void unfollowFriend() {
        System.out.println("Estos son los usuarios de la plataforma, slecciona el que quieras seguir: ");
        List<User> userList2 = Utils.showAndSelectFromList(this.getCurrentUsers(), true, false, this.getActiveUser().getFriends());
        if (!userList2.isEmpty()){
            this.getActiveUser().getFriends().remove(userList2.get(0));
        }
    }
    private void followFriend() {
        System.out.println("Estos son los usuarios de la plataforma, selecciona el que quieras seguir: ");
        List<User> userList = Utils.showAndSelectFromList(this.getCurrentUsers(), true, false, this.getActiveUser().getFriends());
        if (!userList.isEmpty()){
            this.getActiveUser().getFriends().add(userList.get(0));
        }
    }
    //METODO PARA VER EL POST DEL ACTIVE USER
    private void listmyPost() {
        Utils.showFromList(this.activeUser.myOwnPost, true);
    }
    private void listPost(){
        //Map<User, Post> Post = Utils.showFromList(this.uploadedPost, true);
    }
//        for(User u: this.getCurrentUsers()){
//            System.out.println(u.getName());
//        }
//        String stringuserName = Utils.string("Selecciona el usuario a seguir: ");
//        for(User u: this.getCurrentUsers()){
//           if(u.getName().equals(stringuserName)){
//               this.getActiveUser().getFriends().add(u);
//           }
//        }

    //        String username = Utils.string("Escribe el usuario: ");
//        if( username == null) {
//            System.out.println("No te olvides de escribir el nombre del usuario que quieres seguir!");
//            followFriend();
//        }
//        User friend = new User(username);
//        friends.add(friend);
    //Metodo añadir Usuarios a la Red Social
    private void addUser() {
        String username = Utils.string("Escribe el usuario:");
        User newUser = new User(username);
        currentUsers.add(newUser);
    }
    //Metodo eliminar Usuario de la base de datos
    public void removeUser (User u){
        //Listar usuarios actualeas
        //Seleccionar el usuario a eliminar
        //Eliminar el usuario de la lista de usuarios
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce el nombre del usuario a eliminar: ");
        u.name = read.nextLine();
        currentUsers.remove(u);
        Utils.showAndSelectFromList(this.currentUsers, true);
    }


    //private void createPostText (){
    //PostText p1 = new PostText(Utils.string("Introduce título"),new Date(),Utils.string("Introduce texto del post"));
    //uploadedPost.put(getActiveUser(),);

}


