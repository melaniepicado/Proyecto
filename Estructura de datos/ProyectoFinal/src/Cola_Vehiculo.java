/**
 *
 * @author melan
 */
public class Cola_Vehiculo {
    private NodoV frente;
    private NodoV ultimo;
    private int tamaño;

    public Cola_Vehiculo() {
        this.frente = frente;
        this.ultimo = ultimo;
        this.tamaño = tamaño;
    }
    
    public Vehiculo primero(){
        if(frente==null){
            return null;
        }
        return frente.getDato();
    }
    
    public boolean Vacia(){ return frente == null;}
    
    public int tamanio(){ return this.tamaño;}
    
    public NodoV getNode(int index) {

        if (Vacia() || (index < 0 || index >= tamanio())) {
            return null;
        } else if (index == 0) {
            return frente;
        } else if (index == tamanio() - 1) {
            NodoV p = new NodoV();
            return p.getAtras();
        } else {
            NodoV buscado = frente;
            int contador = 0;
            while (contador < index) {
                contador++;
                buscado = buscado.getAtras();
            }
            return buscado;
        }

    }
    
    public void encola (Vehiculo d){
        NodoV v = new NodoV();
        v.setDato(d);
        if (frente == null) {
            frente = v;
            ultimo = v;
        }else{
            ultimo.setAtras(v);
            ultimo = v;
        }
        tamaño ++;
    }
    
    public NodoV atiende(){
        NodoV aux = frente;
        if(frente!=null){
            frente = frente.getAtras();
            aux.setAtras(null);
        }
        tamaño --;
        return aux;
    }
    
    public boolean encuentra (String x){
        NodoV aux = frente;
        boolean esta = false;
        
        while(esta != true && aux != null){
            if(x.equals(aux.getDato().getPlaca())){
                esta = true;
            }else if(x.equals(aux.getDato().getCatPasajeros())){
                esta = true;
            }if(x.equals(aux.getDato().getModelo())){
                esta = true;
            }if(x.equals(aux.getDato().getMarca())){
                esta = true;
            }else{
                aux = aux.getAtras();
            }
        }
        return esta;
    }
    
    public String extraer (String x){
        if(frente != null){
            if(encuentra(x)){
                NodoV aux = null;
                while(!x.equals(frente.getDato().getPlaca())){
                    NodoV temporal = new NodoV();
                    temporal.setDato(frente.getDato());

                    if(aux == null){
                        aux = temporal;
                    }else{
                        temporal.setAtras(aux);
                        aux = temporal;
                    }
                    atiende();
                }
                atiende();
                System.out.println("Datos eliminados existosamente");

                while(aux != null){
                    encola(aux.getDato());
                    aux = aux.getAtras();
                }
                aux = null;
            }else{
                System.out.println("El nodo no existe");
            }
        }else{
            System.out.println("Cola vacía");
        }
        return x;
    }
    
    public void modificar (Vehiculo x){
        NodoV actual = new NodoV();
        actual = frente;
        String encontrado = x.getPlaca();
        if (frente != null){
            while(actual != null & encuentra(encontrado)){
                if(actual.getDato().getPlaca().equals(encontrado)){
                    actual.setDato(x);
                }
                actual = actual.getAtras();
            }
        }else{
            System.out.println("Cola vacía");
        }
    }
    
    public void listar(){
        NodoV aux = frente;
        System.out.println("------------Vehículos registrados------------");
        while(aux != null){
            System.out.println(
                    "Placa: "+aux.getDato().getPlaca()+
                    "\n Marca: "+ aux.getDato().getMarca()+
                    "\n Modelo: "+ aux.getDato().getModelo()+
                    "\n color: "+ aux.getDato().getColor()+
                    "\n Combustible: "+ aux.getDato().getCombustible()+
                    "\n Año: "+ aux.getDato().getAño()+
                    "\n cilindrada: "+ aux.getDato().getCilindrada()+
                    "\n Contidad de pasajeros: "+ aux.getDato().getCatPasajeros()+
                    "\n Precio por día: "+ aux.getDato().getPrecioXdia()+
                    "\n Estado asociado: "+ aux.getDato().getEstadoAsociado()+
                    "\n Extras: "+ aux.getDato().getExtras());
            System.out.println("-----------------------");
            aux = aux.getAtras();
        }
    }
}
