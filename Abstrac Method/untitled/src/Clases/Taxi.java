package Clases;

import Interfaz.Vehiculos;

public class Taxi implements Vehiculos {

    @Override
    public void transportar() {
        System.out.println("El Taxi está transportando pasajeros.");
    }
}
