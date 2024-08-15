package Clases;

import Interfaz.Vehiculos;

public class Buseta implements Vehiculos {

    @Override
    public void transportar() {
        System.out.println("La Buseta está transportando pasajeros.");
    }
}
