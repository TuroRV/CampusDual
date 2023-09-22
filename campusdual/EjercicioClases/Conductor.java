package com.campusdual.EjercicioClases;

public class Conductor extends Persona {

    protected String rutaAsignada;

    public Conductor (String name, String surname, String rutaAsignada){
        super (name,surname);
        this.rutaAsignada = rutaAsignada;
    }

    @Override
    public  void getDetails () {
        System.out.println("Conductor: " + name + " " + surname + " designado a: " + rutaAsignada);
    }
}
