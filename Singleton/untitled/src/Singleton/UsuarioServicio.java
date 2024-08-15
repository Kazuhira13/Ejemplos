package Singleton;

public class UsuarioServicio {

    public void metodoUsuario(){
        Version version = Version.getInstance();
        System.out.println("La versión actual es: " + version.toString());
    }
}
