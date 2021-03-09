package Reposteria;

public class Cliente {
    private String nombre;
    private String apellido;
    private int ladaTel;
    private int telefono;


   public Cliente(){

   }

   public Cliente(String nombre, String apellido, int ladaTel, int telefono){
       this.nombre=nombre;
       this.apellido=apellido;
       this.ladaTel=ladaTel;
       this.telefono=telefono;

   }
   public void setNombre(String nombre) {
       this.nombre = nombre;
   }
   public void setApellido(String apellido) {
       this.apellido = apellido;
   }
   public void setLadaTel(int ladaTel) {
       this.ladaTel = ladaTel;
   }
   public void setTelefono(int telefono) {
       this.telefono = telefono;
   }

   public String getNombre() {
       return nombre;
   }
   public String getApellido() {
       return apellido;
   }
   public int getLadaTel() {
       return ladaTel;
   }
   public int getTelefono() {
       return telefono;
   }
    
}
