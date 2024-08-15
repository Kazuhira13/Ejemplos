package Clases;

public class DragonFactory extends EnemigoFactory{
    @Override
    protected EnemigoBase crearEnemigo() {
        return new Dragones();
    }
}
