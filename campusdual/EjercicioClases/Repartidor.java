package com.campusdual.EjercicioClases;

public class Repartidor extends Persona {

    protected String furgonAsignado;

    public Repartidor (String name, String surname, String furgonAsignado){
        super (name, surname);
        this.furgonAsignado= furgonAsignado;
    }

    @Override
    public void getDetails() {
        System.out.println("Repartidor: " + name + " " + surname + " Asignado al furgón: " + furgonAsignado );
    }
}
