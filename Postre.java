package Reposteria;
import java.util.Scanner;



public abstract class Postre {
    Scanner entrada=new Scanner(System.in);
    protected int precio;//El costo del postre
    protected String nota;//Notas extras que la repostera quiera añadir(Tipo de relleno, si es bajo en azucar, etc)
    protected String disenio;//El diseño que se encargo del pastel y/o postre


    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setNota(String nota) {
        this.nota = nota;
    }
    public void setDisenio(String disenio) {
        this.disenio = disenio;
    }

    public int getPrecio() {
        return precio;
    }
    public String getNota() {
        return nota;
    }
    public String getDisenio() {
        return disenio;
    }

    public abstract void datos();
    
}
