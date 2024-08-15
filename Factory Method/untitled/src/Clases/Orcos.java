package Clases;

public class Orcos extends EnemigoBase{
    @Override
    public void atacar() {
        System.out.println("El Orco ataca con su hacha!");
    }

    @Override
    public void cargar() {
        System.out.println("El Orco carga hacia su enemigo, causando un daño masivo.");
    }
}
