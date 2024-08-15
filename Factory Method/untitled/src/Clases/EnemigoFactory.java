package Clases;

public abstract class EnemigoFactory {
    protected abstract EnemigoBase crearEnemigo();

    public void generarEnemigo() {
        EnemigoBase enemigo = crearEnemigo();
        enemigo.atacar();
        enemigo.cargar();
    }
}
