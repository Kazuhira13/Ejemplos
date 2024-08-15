import Prototype.Enemigo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Enemigo enemigoOri = new Enemigo("Diablo", 100, 50);

        //metodo sin prototype
        Enemigo enemigo = enemigoOri;
        enemigo.setSalud(10);


        //clonar aqui clonamos por metodo
        Enemigo enemigoClon = (Enemigo) enemigoOri.clone();
        Enemigo enemigoClon2 = (Enemigo) enemigoOri.clone();

        //modificamos sus stats
        enemigoClon.setSalud(250);
        enemigoClon.setTipo("Orco");
        enemigoClon2.setDaño(100);

        System.out.println(enemigoOri);
        System.out.println(enemigoClon);
        System.out.println(enemigoClon2);
    }
}