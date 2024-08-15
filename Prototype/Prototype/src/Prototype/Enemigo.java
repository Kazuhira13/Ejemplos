package Prototype;

public class Enemigo implements Prototype{
    private String tipo;
    private int salud;
    private int daño;

    public Enemigo(String tipo,int salud,int daño){
        this.tipo = tipo;
        this.salud = salud;
        this.daño = daño;
    }

    @Override
    public Prototype clone(){
        return new Enemigo(this.tipo,this.salud, this.daño);
    }
    @Override
    public String toString(){
        return "Enemigo{" +
                "tipo='" + tipo + '\'' +
                ", salud=" + salud +
                ", daño=" + daño +
                '}';
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getSalud() {
        return salud;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }
    public int getDaño(){
        return daño;
    }
    public void setDaño(int daño){
        this.daño = daño;
    }
}
