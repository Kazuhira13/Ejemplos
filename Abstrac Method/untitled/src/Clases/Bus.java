package Clases;

import Interfaz.Vehiculos;

public class Bus implements Vehiculos {

    @Override
    public void transportar() {
        System.out.println("El Bus está transportando pasajeros.");
    }
}
