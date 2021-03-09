package Reposteria;



public class Cupcake extends Postre {
    private String sabor;//sabor del cupcake

  public void setSabor(String sabor) {
      this.sabor = sabor;
  }
  public String getSabor() {
      return sabor;
  }

    @Override
     public void datos(){
      System.out.println("Precio del cupcake");
      super.precio=entrada.nextInt();
      System.out.println("Nota para el cupcake");
      super.nota=entrada.next();
      System.out.println("Diseño del cupcake");
      super.disenio=entrada.next();
      System.out.println("Sabor del cupcake");
      sabor=entrada.next();
  }

  @Override
  public String toString() {
      return "Cupcake de "+disenio+" sabor "+sabor+"             precio:"+precio;
  }


}
