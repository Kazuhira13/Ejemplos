public class Usuario {
    //parte 1
    private String nombre;
    private String correo;
    private int edad;
    private String direccion;
    private String telefono;

    //parte 3
    private Usuario(Builder builder){
        this.nombre = builder.nombre;
        this.correo = builder.correo;
        this.edad = builder.edad;
        this.direccion = builder.direccion;
        this.telefono = builder.telefono;

    }
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", correo=" + correo + ", edad="+edad +
                ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    //parte 2
    public static class Builder{
        private String nombre;
        private String correo;
        private int edad;
        private String direccion;
        private String telefono;

        public Builder setNombre(String nombre){
            this.nombre = nombre;
            return this;
        }

        public Builder setCorreo(String correo){
            this.correo = correo;
            return this;
        }
        public Builder setEdad(int edad){
            this.edad = edad;
            return this;
        }
        public Builder setDireccion(String direccion){
            this.direccion = direccion;
            return this;
        }
        public Builder setTelefono(String telefono){
            this.telefono = telefono;
            return this;
        }

        public Usuario build(){
            return new Usuario(this);
        }
    }
}
