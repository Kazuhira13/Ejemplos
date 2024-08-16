package Factory;

import Clases.Enemigo;
import Clases.Golem;

public class GolemFactory extends EnemigoFactory{
    @Override
    public Enemigo createEnemigo() {
        return new Golem();
    }
}
