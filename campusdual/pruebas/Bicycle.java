package com.campusdual.pruebas;

public class Bicycle {

    public String brand;
    public String model;
    public String groupset;
    public int speed = 0;
    public int desgasteTransmisión = 0;

    public Bicycle (String brand, String model, String groupset){
        this.brand = brand;
        this.model = model;
        this.groupset = groupset;
    }

    public void irA20 (){
        speed = 20;
        System.out.println("La bicicleta " + brand + model + "va a " + speed + " km/h");
    }
    public void gastarTransmisión (){
        desgasteTransmisión = 100;
        System.out.println("La transmisión de la bicicleta " + brand + model + "está gastada al " +desgasteTransmisión);
    }
public void stop(){
        speed = 0;
    System.out.println("La bicicleta " + brand  + model + "Se ha parado" );
}

    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle("Trek ", "Slash ", "XX1 ");

        System.out.println(bike1.brand + bike1.model + bike1.groupset);
        bike1.irA20();
        bike1.gastarTransmisión();
        bike1.stop();


    }
}
