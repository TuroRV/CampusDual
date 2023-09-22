package com.campusdual.repaso;

import com.campusdual.Utils;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private String name;

    private String surname;

    private String city;

    private int zipCode;

    private String dni;

    private String primaryNumber;

    private List<String> phoneNumberList = new ArrayList<>();

    public Contact(String name, String surname, String city, int zipCode, String dni) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.zipCode = zipCode;
        this.dni = dni;
    }

    public Contact(){
        this.name = Utils.string("Introduce el nombre: ");
        this.surname = Utils.string("Introduce el apellido: ");
        this.city = Utils.string("Introduce la ciudad: ");
        this.zipCode = Utils.integer("Introduce el CP: ");
        this.dni = Utils.string("Introduce el DNI: ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<String> getPhoneNumberList() {
        return phoneNumberList;
    }

    public void setPhoneNumberList(List<String> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
    }

    public String getPrimaryNumber() {
        return primaryNumber;
    }

    public void setPrimaryNumber(String primaryNumber) {
        this.primaryNumber = primaryNumber;
    }

    // Método
    public void addNumber(String phone){
        this.getPhoneNumberList().add (phone); //añado a la lista de teléfonos el teléfono que yo le paso por parámetro
        if (this.getPrimaryNumber() == null){
            this.setPrimaryNumber(phone); // si no tenemos un tlf añadimos el phone como primaryNumber
        }
    }

    public void callPerson(Contact p){
        if (p.getPrimaryNumber() != null) {
            System.out.println(this.getName() + " " + this.getSurname() + " está llamando a " + p.getName() + " " + p.getSurname() + " (" + p.getPrimaryNumber() + ")");
        }else {
            System.out.println(p.getName() + " " + p.getSurname() + " no tiene número de teléfono");
        }
    }

}
