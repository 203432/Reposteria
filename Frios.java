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
        nombre=entrada.nextLine();
        do{
      System.out.println("Precio del postre ");
      super.precio=entrada.nextInt();
        }while(super.precio<1);
        entrada.nextLine();
      System.out.println("Nota para el postre");
      super.nota=entrada.nextLine();
      System.out.println("Diseño del postre");
      super.disenio=entrada.nextLine();
     
  }

  @Override
  public String toString() {
      return nombre+ " de "+disenio+"                       precio:"+precio;
  }
    
}
