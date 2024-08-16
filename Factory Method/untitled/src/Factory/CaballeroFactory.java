package Factory;

import Clases.Caballero;
import Clases.Enemigo;

public class CaballeroFactory extends EnemigoFactory{
    @Override
    public Enemigo createEnemigo() {
        return new Caballero();
    }
}
