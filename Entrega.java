package Reposteria;

import java.util.Calendar;

public class Entrega {
    Calendar fechaEntrega=Calendar.getInstance();

    public Entrega(int anio, int mes, int dia, int hora, int min){
        fechaEntrega.set(anio, mes-1, dia, hora, min);
        
    }
    public Calendar getFechaEntrega() {
        return fechaEntrega;
    }
    public int getAnio(){
        return fechaEntrega.get(Calendar.YEAR);
    }
    public int getMes(){
        return fechaEntrega.get(Calendar.MONTH)+1;
    }
    public int getDia(){
        return fechaEntrega.get(Calendar.DATE);
    }
    public int getHora(){
        return fechaEntrega.get(Calendar.HOUR);
    }
    public int getMins(){
        return fechaEntrega.get(Calendar.MINUTE);
    }
   public void setAnio(int anio){
       this.fechaEntrega.set(Calendar.YEAR, anio);
   }
   public void setMes(int mes){
    this.fechaEntrega.set(Calendar.MONTH, mes-1);
}
public void setDia(int dia){
    this.fechaEntrega.set(Calendar.DATE, dia);
}
public void setHora(int hora){
    this.fechaEntrega.set(Calendar.HOUR, hora);
}
public void setMin(int min){
    this.fechaEntrega.set(Calendar.MINUTE, min);
}
  
}
