package Reposteria;

public class Frios extends Postre {

    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

  
    @Override
     public void datos(){
        System.out.println("Nombre del postre");
        nombre=entrada.next();
      System.out.println("Precio del postre ");
      super.precio=entrada.nextInt();
      System.out.println("Nota para el postre");
      super.nota=entrada.next();
      System.out.println("Diseño del postre");
      super.disenio=entrada.next();
     
  }

  @Override
  public String toString() {
      return nombre+ " de "+disenio+"                       precio:"+precio;
  }
    
}
