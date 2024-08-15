import Factory.BusFactory;
import Interfaz.VehiculoFactory;
import Interfaz.Vehiculos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainTransporte {
    //no necesita saber qué tipo concreto de vehículo está usando, solo que es un Vehiculo
    private Vehiculos vehiculo;
    // El constructor recibe una fábrica y usa la fábrica para crear el vehículo
    public MainTransporte(VehiculoFactory factory){
        vehiculo = factory.crearVehiculo();
    }

    public void iniciarTransporte(){
        vehiculo.transportar();
    }
    public static void main(String[] args) {
        VehiculoFactory busFactory = new BusFactory();
        MainTransporte transporte = new MainTransporte(busFactory);
        transporte.iniciarTransporte();
    }
}