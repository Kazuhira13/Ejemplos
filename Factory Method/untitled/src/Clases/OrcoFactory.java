package Clases;

public class OrcoFactory extends EnemigoFactory{
    @Override
    protected EnemigoBase crearEnemigo() {
        return new Orcos();
    }
}
