
import javax.swing.JOptionPane;

public class CategoriaVehiculos extends Alquiler_de_vehículos{
    
        private String  Marca_del_vehículoZ1 = "Maserati";
        private String Cantidad_de_pasajerosZ1 = "2";
        private String Modelo_del_vehículoZ1 = "2022";
        private String Extras = "CÁMARA DE VISIÓNZ1 360 GRADOS";

        private String  Marca_del_vehículoZ2 = "Porsche";
        private String Cantidad_de_pasajerosZ2 = "2";
        private String Modelo_del_vehículoZ2 = "2021";
        private String ExtrasZ2 = "CONEXIÓN A INTERNET";

        private String Marca_del_vehículoZ3 = "Rolls Royce";
        private String Cantidad_de_pasajerosZ3 = "4";
        private String Modelo_del_vehículoZ3 = "2022";
        private String ExtrasZ3 = "SISTEMA DE ENTRETENIMIENTO EN LOS ASIENTOS POSTERIORES";
        
        private String Marca_del_vehículoO1 = "Ford";
        private String Cantidad_de_pasajerosO1 = "4";
        private String Modelo_del_vehículoO1 = "2020";
        private String ExtrasO1 = "CÁMARA DE VISIÓN 360 GRADOS";

        private String  Marca_del_vehículoO2 = "BMW";
        private String Cantidad_de_pasajerosO2 = "4";
        private String Modelo_del_vehículoO2 = "2019";
        private String ExtrasO2 = "FRENADA AUTOMÁTICA DE EMERGENCIA";
        
        private String  Marca_del_vehículoO3 = "chevrolet"; 
        private String Cantidad_de_pasajerosO3 = "2";
        private String Modelo_del_vehículoO3 = "2019";
        private String ExtrasO3 = "CÁMARA DE VISIÓN 360 GRADOS";
        
        
        private String  Marca_del_vehículoP1 = "Honda";
        private String Cantidad_de_pasajerosP1 = "4";
        private String Modelo_del_vehículoP1 = "2018";
        private String ExtrasP1 = "FRENADA AUTOMÁTICA DE EMERGENCIA";

        private String  Marca_del_vehículoP2 = "Nissan";
        private String Cantidad_de_pasajerosP2 = "4";
        private String Modelo_del_vehículoP2 = "2019";
        private String ExtrasP2 = "FRENADA AUTOMÁTICA DE EMERGENCIA";
       
        private String Marca_del_vehículoB1 = "Toyota";
        private String Cantidad_de_pasajerosB1 = "4";
        private String Modelo_del_vehículoB1 = "2017";
        private String ExtrasB1 = "FRENADA AUTOMÁTICA DE EMERGENCIA";
        
        private String Marca_del_vehículoB2 = "Volvo";
        private String Cantidad_de_pasajerosB2 = "4";
        private String Modelo_del_vehículoB2 ="2016";
        private String ExtrasB2 = "FRENADA AUTOMÁTICA DE EMERGENCIA";
       
         @Override
    public void agregar(){
        super.agregar();
    }
     
    public void Zafiro(){
         if(Marca_del_vehículo.equals(Marca_del_vehículoZ2)){
             JOptionPane.showMessageDialog(null,"El vehiculo solicitado esta en la lista");
             JOptionPane.showMessageDialog(null,Marca_del_vehículoZ2+"\n"+
                                                Cantidad_de_pasajerosZ2+"\n"+
                                                Modelo_del_vehículoZ2+"\n"+
                                                ExtrasZ2);
         }else{
              JOptionPane.showMessageDialog(null,"El vehiculo solicitado esta en la lista");
         }
    }
    
    public void Oro(){
       if(Marca_del_vehículo.equals(Marca_del_vehículoO3)){
             JOptionPane.showMessageDialog(null,"El vehiculo solicitado esta en la lista");
         }else{
              JOptionPane.showMessageDialog(null,"El vehiculo solicitado esta en la lista");
         }
    }
    
    public void Plata(){
        if(Marca_del_vehículo.equals(Marca_del_vehículoP2)){
             JOptionPane.showMessageDialog(null,"El vehiculo solicitado esta en la lista");
         }else{
              JOptionPane.showMessageDialog(null,"El vehiculo solicitado esta en la lista");
         }
        
    }
    public void Bronce(){
     
         if(Marca_del_vehículo.equals(Marca_del_vehículoB1)){
             JOptionPane.showMessageDialog(null,"El vehiculo solicitado esta en la lista");
         }else{
              JOptionPane.showMessageDialog(null,"El vehiculo solicitado esta en la lista");
         } 
    }    
}
