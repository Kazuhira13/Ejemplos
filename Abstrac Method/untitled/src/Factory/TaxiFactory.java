package Factory;

import Clases.Taxi;
import Interfaz.VehiculoFactory;
import Interfaz.Vehiculos;

public class TaxiFactory implements VehiculoFactory {
    @Override
    public Vehiculos crearVehiculo() {
        return new Taxi();
    }
}
