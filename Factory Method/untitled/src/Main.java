import Clases.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EnemigoBase enemigo1 = new Orcos();
        enemigo1.atacar();

        EnemigoBase enemigo2 = new Dragones();
        enemigo2.atacar();

        EnemigoFactory orcoFactory = new OrcoFactory();
        orcoFactory.generarEnemigo();
    }
}