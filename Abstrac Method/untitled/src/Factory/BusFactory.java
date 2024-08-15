package Factory;

import Clases.Bus;
import Interfaz.VehiculoFactory;
import Interfaz.Vehiculos;

public class BusFactory implements VehiculoFactory {
    @Override
    public Vehiculos crearVehiculo() {
        return new Bus();
    }
}
