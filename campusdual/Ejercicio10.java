package com.campusdual;

import java.util.Random;

public class Ejercicio10 {


    public static int numeroAleatorioEnUnRango(int min, int max) {
        Random random = new Random();
        max++;
        return random.nextInt(max - min) + min;
    }

    public static void sacarPelotitas(int max) {
        for (int i = 0; i < max; i++) {
            int aleatorio = numeroAleatorioEnUnRango(1, 3);
            if (aleatorio == 1) {
                System.out.println("Pelota azul");

            } else if (aleatorio == 2) {
                System.out.println("Pelota roja");
            } else {
                System.out.println("Pelota verde");
            }


        }
    }
        public static void main (String[]args){
            sacarPelotitas(20);
        }

        //sacar una bola de color verde, azul o rojo de manera aleatoria 20 veces desde una caja
    }
