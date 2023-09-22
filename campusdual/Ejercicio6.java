package com.campusdual;

import java.time.Month;
import java.util.Calendar;

public class Ejercicio6 {
    //Comprobar cual es la estación del año
    //Comprobar si es de mañana tarde o noche



    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        int mes = cal.get(Calendar.MONTH) + 1;

        int hora = cal.get(Calendar.HOUR_OF_DAY);

        switch (mes) {
            case 1:
            case 2:
            case 3:
                System.out.println("Invierno");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Primavera");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Verano");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("No existe el mes");

        }
        switch (hora) {
            case 21:
            case 22:
            case 23:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Noche");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Mañana");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Tarde");
                break;
            default:
                System.out.println("No existe esta zona horaria");

        }
    }
    }
