package com.campusdual;

public class Ejercicio7 {

    //Muestra los 15 primeros números naturales
    //Suma los primeros 100 números naturales

    public static void main(String[] args) {
        for (int a = 0; a < 15; a++) {
            System.out.println("Número " + (a + 1));

        }
        cien();
        System.out.println("Suma 100 primeros " + cien());

    }

    public static int cien() {
        int suma = 0;
        for (int b = 0; b <= 100; b++) {
            suma = suma + b;

        }

        return suma;

    }
}