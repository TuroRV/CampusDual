package com.campusdual.Ejercicio13;

public class CustomObject {


        public int actualFuel = 10;

        public int getActualFuel() {
            return this.actualFuel;
        }

        public void setActualFuel(int actualFuel) {
            if (actualFuel >= 0) {
                this.actualFuel = actualFuel;
            } else {
                System.out.println("La capacidad no puede ser negativa");
            }
        }

        public void showDetails() {
            System.out.println("La capacidad actual es de " + this.getActualFuel() + " litros.");
        }

        public static void main(String[] args) {
            CustomObject cO = new CustomObject();
            cO.showDetails();
            System.out.println("Actualización capacidad");
            cO.setActualFuel(-8);
            cO.showDetails();
        }
    }



