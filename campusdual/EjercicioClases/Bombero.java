package com.campusdual.EjercicioClases;

public class Bombero extends Persona {

    protected String zonaAsignada;

    public Bombero (String name, String surname, String zonaAsignada){
        super (name,surname);
        this.zonaAsignada = zonaAsignada;
    }

    @Override
    public void getDetails() {
        System.out.println("Bombero: " + name + " " + surname + " designado a la zona: " + zonaAsignada);
    }
}
