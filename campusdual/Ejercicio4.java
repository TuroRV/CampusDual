package com.campusdual;

public class Ejercicio4 {

    // Sumar los 5 primeros números naturales
    // Sumar los 20 primeros números pares
    // Calcular el factorial de un número (Fatorial de 5 = 5*4*3*2*1)

    public static int sumanatural(){
        int resultado= 1+2+3+4+5;
        return resultado;
    }

    public static void sumapares (){
        int resultado = 2+4+6+8+10+12+14+161+18+20+22+24+26+28+30+32+34+36+38+40;
        System.out.println("El resultado de los 20 primeros números pares es: " + resultado);

    }

    // public static int calcularfactorial (){}

    public static void main(String[] args) {
        int resultado5 = sumanatural ();
        System.out.println("El resultado de los 5 primeros numeros naturales es: " + resultado5);
        sumapares();

        int facftorial = 5*4*3*2*1;
        System.out.println(facftorial);
    }

}
