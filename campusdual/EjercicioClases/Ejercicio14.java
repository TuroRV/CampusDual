package com.campusdual.EjercicioClases;

public class Ejercicio14 {
    public static void main(String[] args) {

        Bombero bombero1 = new Bombero("Pepe","García","Peñamoa");
        Conductor conductor1 = new Conductor("Baby","Driver","Ruta 66");
        Repartidor repartidor1 = new Repartidor("Carlos","Lumbreras","Berlingo");

        bombero1.getDetails();
        conductor1.getDetails();
        repartidor1.getDetails();
    }

}
