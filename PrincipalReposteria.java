package Reposteria;
import java.util.ArrayList;
import java.util.Scanner;


public class PrincipalReposteria {
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos=new ArrayList<Pedido>();
        int accion=1;  
    System.out.println("Buenas tardes");
    do{
    System.out.println("Cantidad de pedidos pendientes: "+pedidos.size());
    System.out.println("¿Que desea hacer?");
    System.out.println("1---Agregar Pedido");
    System.out.println("2---Eliminar pedido");
    System.out.println("3---Editar pedido");
    System.out.println("4---Ver pedidos");
    System.out.println("5---Salir");
    accion=entrada.nextInt();  
    switch(accion){
        case 1: agregarPedido(pedidos); accion=6;
        break;
        case 2: eliminarPedido(pedidos); accion=6;
        break;
        case 3: editarPedido(pedidos); accion=6;
        break;
        case 4: verPedidos(pedidos);
                infoPedidos(pedidos);
                accion=6;
        break;
        case 5:System.out.println("Nos vemos pronto");
        break;
        default:System.out.println("Error, intente de nuevo");
        break;
    }
}while(accion<=0||accion>=6);
}



public static void agregarPedido(ArrayList<Pedido> lista){
Pedido pedido=new Pedido();
pedido.registrarCliente();
pedido.registrarEntrega();
pedido.registrarPostres();
pedido.totalPagar();
do{
System.out.println("Cuanto dejara de anticipo");
pedido.setAnticipo(entrada.nextInt());
if(pedido.getAnticipo()>pedido.getTotalPagar()){
    System.out.println("Usted esta dejando mas anticipo de lo que debe pagar, por favor deje menos anticipo");
}
}while(pedido.getAnticipo()>pedido.getTotalPagar());
lista.add(pedido);
}



public static void eliminarPedido(ArrayList<Pedido> lista){
    int eliminar,validar;
    if(!lista.isEmpty()){
verPedidos(lista);
System.out.println("Seleccione el numero del pedido que quiera eliminar");
eliminar=entrada.nextInt();
System.out.println("Estas seguro? Se perderan los datos del pedido eliminado");
System.out.println("1-Eliminar pedido "+eliminar   +" 2-No eliminar");
validar=entrada.nextInt();
if(validar==1){
    lista.remove(eliminar-1);
    System.out.println("Pedido No."+eliminar+" ha sido eliminado");
}
}else{
    System.out.println("No hay pedidos que eliminar");
}
}



public static void verPedidos(ArrayList<Pedido> lista){

    if(lista.isEmpty()){
        System.out.println("No hay pedidos pendientes");
    }
    for(int i=0;i<lista.size();i++){
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Pedido No. "+(i+1));
        int restante=lista.get(i).getTotalPagar()-lista.get(i).getAnticipo();
        System.out.println(lista.get(i));
        lista.get(i).mostrarPostres();
        System.out.println("Anticipo:                              "+lista.get(i).getAnticipo());
        System.out.println("Restante del pago                      "+restante);
        System.out.println("---------------------------------------------------------------------------------------------------");
    }
   
}

public static void infoPedidos(ArrayList<Pedido> lista){
    int info;
    if(!lista.isEmpty()){
    System.out.println("Si quiere ver mas informacion sobre un pedido, escriba el numero de ese pedido");
    System.out.println("Si quiere salir, presione 0");
    info=entrada.nextInt();
    if(info!=0){
        lista.get(info-1).infoDetallada();
    }
    }
}


public static void editarPedido(ArrayList<Pedido> lista){
    int pedido,accion,borrarPostre;
    verPedidos(lista);
    if(!lista.isEmpty()){
    System.out.println("Que pedido desea editar");
    pedido=entrada.nextInt();
    System.out.println("Que desea editar");
    System.out.println("1---Datos del cliente");
    System.out.println("2---Datos de la entrega");
    System.out.println("3---Borrar postre");
    System.out.println("4---Agregar Postre");
    accion=entrada.nextInt();
    switch(accion){
        case 1:
        lista.get(pedido-1).editarCliente();
        break;
        case 2:
        lista.get(pedido-1).editarEntrega();
        break;
        case 3:
       System.out.println("Estos son los postres que contiene el pedido num."+pedido);
        lista.get(pedido-1).mostrarPostres();
        System.out.println("Seleccione el numero del postre que desee borrar");
        borrarPostre=entrada.nextInt();
        lista.get(pedido-1).borrarPostre(borrarPostre);
        lista.get(pedido-1).totalPagar();
        break;
        case 4:
        lista.get(pedido-1).registrarPostres();
        lista.get(pedido-1).totalPagar();
        break;
    }
    }
}

} 