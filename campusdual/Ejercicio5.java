package com.campusdual;

public class Ejercicio5 {

    // Comprobar si un número es positivo o negativo
    // Comprobar si un número es múltiplo de otro
    // Comprobar que un número sea menor que otro

    public static void main(String[] args) {
        comprobarPositivo(0);
        System.out.println("Múltiplos: " + comprobarMultiplo(4,2));
        comprobarNumeroMenorQueOtro (3,4);
    }

    public static void comprobarPositivo (int number){

        if (number >= 0){
            System.out.println("Número positivo");
        }else {
            System.out.println("Número negativo");

        }


    }
    public static void comprobarNumeroMenorQueOtro (int number1, int number2){
        if (number1 < number2){
            System.out.println("El número es menor que" + number2);
        }else {
            System.out.println("El número no es menor" + number1);
        }
}

    public static boolean comprobarMultiplo (int number1, int number2){
        if (number1 % number2 != 0){
            return false;
        } else {
            return true;
        }

    }
}
