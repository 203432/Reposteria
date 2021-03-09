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
     System.out.println("Precio de la galleta");
     super.precio=entrada.nextInt();
     System.out.println("Nota para la galleta");
     super.nota=entrada.next();
     System.out.println("Diseño de la galleta");
     super.disenio=entrada.next();
     System.out.println("forma de la galleta");
     forma=entrada.next();
 }

 @Override
 public String toString() {
     return "Galleta de "+disenio+" en forma de "+forma+"             precio:"+precio; 
 }
}
