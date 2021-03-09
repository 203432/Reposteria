package Reposteria;

public class Pastel extends Postre {

    private String sabor;
    private int Pisos;


    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public void setPisos(int pisos) {
        Pisos = pisos;
    }
   public String getSabor() {
       return sabor;
   }
    public int getPisos() {
        return Pisos;
    }

    @Override
    public void datos(){
     System.out.println("Precio del pastel");
     super.precio=entrada.nextInt();
     System.out.println("Nota para el pastel");
     super.nota=entrada.next();
     System.out.println("Diseño del pastel");
     super.disenio=entrada.next();
     System.out.println("Sabor del pastel");
     sabor=entrada.next();
     System.out.println("Pisos del pastel");
     Pisos=entrada.nextInt();
 }


 @Override
 public String toString() {
     return "Pastel de "+disenio+" sabor "+sabor+" de "+Pisos+" pisos            precio:"+precio;
 }

  
}
