package Reposteria;

public class Galleta extends Postre{
    private String forma;//Usualmente las galletas que ella hace siempre tienen una forma en especifico

   public void setForma(String forma) {
       this.forma = forma;
   }
   public String getForma() {
       return forma;
   }

    @Override
    public void datos(){
        do{
     System.out.println("Precio de la galleta");
     super.precio=entrada.nextInt();
    }while(super.precio<1);
    entrada.nextLine();
     System.out.println("Nota para la galleta");
     super.nota=entrada.nextLine();
     System.out.println("Diseño de la galleta");
     super.disenio=entrada.nextLine();
     System.out.println("forma de la galleta");
     forma=entrada.nextLine();
 }

 @Override
 public String toString() {
     return "Galleta de "+disenio+" en forma de "+forma+"             precio:"+precio; 
 }
}
