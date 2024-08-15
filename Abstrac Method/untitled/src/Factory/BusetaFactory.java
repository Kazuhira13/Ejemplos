package Factory;

import Clases.Buseta;
import Interfaz.VehiculoFactory;
import Interfaz.Vehiculos;

public class BusetaFactory implements VehiculoFactory {
    @Override
    public Vehiculos crearVehiculo() {
        return new Buseta();
    }
}
