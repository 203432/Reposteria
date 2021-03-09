package Reposteria;
import java.util.Scanner;
import java.util.ArrayList;

public class Pedido {
    static Scanner entrada=new Scanner(System.in);
    private Cliente datosCliente;
    private Entrega datosEntrega;
    private int anticipo;
    private int totalPagar;
    ArrayList<Postre> postres=new ArrayList<Postre>();




    public void registrarCliente(){
        String nombre,apellido;
        int lada, telefono;
        System.out.println("Escriba el nombre del cliente: ");
        nombre=entrada.next();
        System.out.println("Escriba el apellido del cliente: ");
        apellido=entrada.next();
        System.out.println("Escriba los tres primeros numeros del telefono del cliente: ");
        lada=entrada.nextInt();
        System.out.println("Escriba los numeros restantes del telefono: ");
        telefono=entrada.nextInt();

        datosCliente=new Cliente(nombre, apellido, lada, telefono);
    }

    public void registrarEntrega(){
        int dia, mes, hora,anio;
        System.out.println("Año de entrega: ");
        anio=entrada.nextInt();
        System.out.println("¿De que mes? ");
        mes=entrada.nextInt();
        System.out.println("¿Que dia se entregara?: ");
        dia=entrada.nextInt();
        
        System.out.println("¿A que hora se entregara?");
        hora=entrada.nextInt();

        datosEntrega=new Entrega(anio,mes,dia,hora,0);

    }
    
    public void registrarPostres(){
        int opcion,repetir;
        do{
        System.out.println("Que tipo de postre se encargo?");
        System.out.println("1-----Pastel");
        System.out.println("2-----Cupcake");
        System.out.println("3-----Galleta");
        System.out.println("4----- Postre frio");
        opcion=entrada.nextInt();
        switch(opcion){
            case 1:
            Pastel pastel=new Pastel();
            pastel.datos();
            postres.add(pastel);
            break;
            case 2:
            Cupcake cupcake=new Cupcake();
            cupcake.datos();
            postres.add(cupcake);
            break;
            case 3:
            Galleta galleta=new Galleta();
            galleta.datos();
            postres.add(galleta);
            break;
            case 4:
            Frios frio=new Frios();
            frio.datos();
            postres.add(frio);
            break;
        }
System.out.println("Quiere agregar otro postre?   1----Si   2----No");
    repetir=entrada.nextInt();
    }while(repetir==1);
    }

    public void totalPagar(){
        int acumulador=0;
        for(int i=0;i<postres.size();i++){
            acumulador=acumulador+postres.get(i).getPrecio();
        }
        System.out.println("El total es: "+acumulador);
        this.totalPagar=acumulador;
    }

    public void mostrarPostres(){
        System.out.println("Este encargo tiene "+postres.size()+" postres");
        for(int i=0;i<postres.size();i++){
            System.out.println("Postre no. "+(i+1));
            System.out.println(postres.get(i));
        }
        System.out.println("Total a pagar:                       "+totalPagar);
    }


public void setAnticipo(int anticipo) {
    this.anticipo = anticipo;
}
public int getAnticipo() {
    return anticipo;
}
public int getTotalPagar() {
    return totalPagar;
}

public void editarCliente(){
    int editar,repetir;
    do{
    System.out.println("Que desea editar:");
    System.out.println("1---Nombre");
    System.out.println("2---Apellido");
    System.out.println("3---Telefono");
    editar=entrada.nextInt();
    switch(editar){
        case 1: 
        System.out.println("Escriba el nombre del cliente");
        datosCliente.setNombre(entrada.next());
        break;
        case 2:
        System.out.println("Escriba el apellido del cliente");
        datosCliente.setApellido(entrada.next());
        break;
        case 3:
        System.out.println("Escriba los primeros 3 digitos del telefono");
        datosCliente.setLadaTel(entrada.nextInt());
        System.out.println("Escriba los siguientes digitos del telefono");
        datosCliente.setTelefono(entrada.nextInt());
        break;
    }
    System.out.println("Desea cambiar algun otro dato del cliente:  1-Si 2-No");
    repetir=entrada.nextInt();
}while(repetir==1);
}


public void editarEntrega(){
    int editar,repetir;
    do{
    System.out.println("Que desea editar:");
    System.out.println("1-año");
    System.out.println("2-Mes");
    System.out.println("3-Dia");
    System.out.println("4-Hora");
    editar=entrada.nextInt();
    switch(editar){
        case 1:
        System.out.println("Año:");
        datosEntrega.setAnio(entrada.nextInt());
        break;
        case 2:
        System.out.println("Mes:");
        datosEntrega.setMes(entrada.nextInt());
        break;
        case 3:
        System.out.println("Dia:");
        datosEntrega.setDia(entrada.nextInt());
        break;
        case 4:
        System.out.println("Hora:");
        datosEntrega.setHora(entrada.nextInt());
        System.out.println("Min:");
        datosEntrega.setMin(entrada.nextInt());
        break;
    }
    System.out.println("Desea cambiar algun otro dato a la fecha de entrega:  1-Si 2-No");
    repetir=entrada.nextInt();
    }while(repetir==1);

}

public void borrarPostre(int postreSelec){
    postres.remove(postreSelec-1);
    System.out.println("Pedido No."+postreSelec+" ha sido eliminado");

}


public void infoDetallada(){
    System.out.println("Nombre del cliente: "+datosCliente.getNombre());
    System.out.println("Apellido del cliente: "+datosCliente.getApellido());
    System.out.println("Numero de telefono: ("+datosCliente.getLadaTel()+")"+datosCliente.getTelefono());
    System.out.println("Fecha de entrega:");
    System.out.println("Año: "+datosEntrega.getAnio());
    System.out.println("Mes: "+datosEntrega.getMes());
    System.out.println("Dia: "+datosEntrega.getDia());
    System.out.println("Hora: "+datosEntrega.getHora()+":"+datosEntrega.getMins());
    System.out.println("Postres pedidos en este encargo: "+postres.size());
    for(int i=0;i<postres.size();i++){
        System.out.println("Postre no. "+(i+1));
            System.out.println(postres.get(i));
            System.out.println("Nota adicional: ");
            System.out.println(postres.get(i).getNota());   
    }
    System.out.println("Total a pagar: "+totalPagar);
    System.out.println("Anticipo: "+anticipo);
}
    @Override
    public String toString() {
    return datosCliente.getNombre()+" "+datosCliente.getApellido()+": "+datosCliente.getLadaTel()+datosCliente.getTelefono()+" \n"+
    "Fecha de entrega: "+ datosEntrega.getFechaEntrega().getTime();
    }
    
}
