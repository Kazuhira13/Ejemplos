//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario.Builder()
                .setNombre("Juan Pérez")
                .setCorreo("juan.perez@example.com")
                .setEdad(30)
                .setDireccion("Calle 2 barrio lodos 123")
                .setTelefono("123456789")
                .build();

        System.out.println(usuario);

    }
}