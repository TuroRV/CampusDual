package com.campusdual.Ejercicio11;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int steeringWheelAngle = 0;

public Car (String brand, String model, String fuel){
    this.brand = brand;
    this.model= model;
    this.fuel = fuel;
}
public void start(){
    if (this.tachometer == 0){
    this.tachometer = 1000;
    System.out.println("Coche encendido");
}else{
        System.out.println("El coche ya está encendido");}
}
public void stop(){
    if (this.speedometer == 0 && this.tachometer == 1000) {
        this.tachometer = 0;
        System.out.println("El coche se apaga");
    }else {
        System.out.println("El coche no se puede apagar en movimiento");
    }
}
public void accelerate() {
    while (this.speedometer < Car.MAX_SPEED){
        this.speedometer += 10;
        System.out.println("Velocidad: " + this.speedometer);
    }
    System.out.println("Alcanzada velocidad máxima" );
}
public void brake (){
    while (this.speedometer > 0){
            this.speedometer -= 10;
    System.out.println("Velocidad: " + this.speedometer);
    }
    System.out.println("El coche ha frenado completamente ");
}
public void turnSteeringWheel(int giro){
    this.steeringWheelAngle = giro;
    if (this.steeringWheelAngle < 0) {
        System.out.println("EL coche gira a la izquierda");
    }if (this.steeringWheelAngle > 0) {
        System.out.println("El coche gira a la derecha");
    }

}
public void reverse(){
    if (this.speedometer == 0){
        if (this.reverse == true) {
            System.out.println("El coche cambia a marcha adelante");
            this.reverse = false;
        } else {
            System.out.println("El coche cambia a marcha atrás");
            this.reverse = true;
        }
    }else {
        System.out.println("No puedes poner la marcha atrás en movimiento");
    }

}
    public static void main(String[] args) {
       Car coche1 = new Car ("Honda ","Civic ","Gasolina ");
       Car coche2 = new Car ("Toyota ","Corolla ","Diesel ");

        System.out.println(coche1.brand + coche1.model + coche1.fuel);
        System.out.println(coche2.brand);
        System.out.println("Tacómetro coche1 " + coche1.tachometer);
        System.out.println("Tacómetro coche2 " + coche2.tachometer);
        coche1.start();
        coche1 .start();
        System.out.println("Tacómetro coche1 " + coche1.tachometer);
        System.out.println("Tacómetro coche2 " + coche2.tachometer);
        coche1.accelerate();
        coche1.brake();
        coche1.turnSteeringWheel(-50);
        coche1.reverse();
    }
}