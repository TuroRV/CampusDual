package com.campusdual.pruebas.Bicicletas;

public class Trek extends Bicicleta implements Ibike {

    protected String discipline;

    public Trek(String brand, String model, String discipline) {
        super(brand,model);
        this.discipline = discipline;
    }

    @Override
    public void acelerar() {
        System.out.println("La bicicleta " + brand + " " + model + " " + discipline + " está acelerando");

    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta " + brand + " " + model + " " + discipline + " está frenando");

    }

public void getDetails (){
    System.out.println("Información general de la bicicleta --> Marca: " + brand + ", Modelo: " + model + " disciplina: " + discipline);
};

}
