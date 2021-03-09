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
         do{
      System.out.println("Precio del cupcake");
      super.precio=entrada.nextInt();
         }while(super.precio<1);
         entrada.nextLine();
      System.out.println("Nota para el cupcake");
      super.nota=entrada.nextLine();
      System.out.println("Diseño del cupcake");
      super.disenio=entrada.nextLine();
      System.out.println("Sabor del cupcake");
      sabor=entrada.next();
  }

  @Override
  public String toString() {
      return "Cupcake de "+disenio+" sabor "+sabor+"             precio:"+precio;
  }


}
