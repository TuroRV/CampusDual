package com.campusdual;

public class Main {

    public static void grettings(){
        System.out.println("hola");
    }

    public static void grettingsWithName(String name, String surname){
        System.out.println("Hola " + name + " "+ surname);
    }

    public static int funcionSuma ( int value1, int value2){
        int result = value1 + value2;
        return result;
    }

    public static void procedimientoSuma ( int value1, int value2){
        value1++;
        int result = value1 + value2;
        System.out.println("El resultado es: " + result);

    }

    public static void main(String[] args) {

        int valueSum = funcionSuma(3, 2);
        System.out.println(valueSum);
        procedimientoSuma(6, 8);

    }
}
