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
        do{
     System.out.println("Precio del pastel");
     super.precio=entrada.nextInt();
        }while(super.precio<1);
        entrada.nextLine();
     System.out.println("Nota para el pastel");
     super.nota=entrada.nextLine();
     System.out.println("Diseño del pastel");
     super.disenio=entrada.nextLine();
     System.out.println("Sabor del pastel");
     sabor=entrada.nextLine();
     do{
     System.out.println("Pisos del pastel");
     Pisos=entrada.nextInt();
     }while(Pisos<1);
 }


 @Override
 public String toString() {
     return "Pastel de "+disenio+" sabor "+sabor+" de "+Pisos+" pisos            precio:"+precio;
 }

  
}
