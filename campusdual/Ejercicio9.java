package com.campusdual;

public class Ejercicio9 {

    //Realizar un bucle mientras una variable se incrementa hasta un valor tope usando do-while
public static void repetirHasta (int max) {

    int i = 0;
    do {
        System.out.println("iteración numero: " + (i+1));
        i++;
    } while (i<max);
}

    public static void main(String[] args) {
        repetirHasta (20);
    }
}

