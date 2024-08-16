package Factory;


import Clases.Enemigo;
import Clases.Golem;

public abstract class EnemigoFactory {
    //metodo factory
    public abstract Enemigo createEnemigo();

    //otro metodo que utiliza el metodo
    public void SpawnEnemigo(){
        Enemigo enemigo = createEnemigo();
        System.out.println("Un nuevo eneimgo aparece" );

        enemigo.atacaar();
    }
}
