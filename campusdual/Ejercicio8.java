package com.campusdual;

public class Ejercicio8 {

    public static void repetirHasta (int max){
        int i = 0;
        while (i<max){
            System.out.println("Iteración número: " + (i+1));
            i++;
        }
    }

    // Ejercicio 8: Realizar un bucle mientras una variable se incrementa hasta un valor tope:

    public static void main(String[] args) {

        repetirHasta (20);

    }

}
