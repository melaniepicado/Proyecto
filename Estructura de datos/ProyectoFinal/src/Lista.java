/**
 *
 * @author MIKE-PC
 */
public class Lista {
    
    private NodoC cabeza;
    private NodoC ultimo;
    
    public void inserta(Cliente p){
        if(cabeza==null){
            cabeza = new NodoC(p);
            ultimo = cabeza;
        
        }else{
           NodoC aux = new NodoC(p);
           aux.setNext(cabeza);
           cabeza=aux;
        }
        ultimo.setNext(cabeza);
    }
    
    public void edit(Cliente p){
        NodoC aux = cabeza;
        while(aux != null && aux.getNext().getDato().getCedula() != p.getCedula()){
            aux = aux.getNext();
        }
        aux.getNext().setDato(p);
    }
    
    public void remove(Cliente p){
        NodoC aux = cabeza;
        while(aux.getNext().getDato().getCedula() != p.getCedula()){
            aux = aux.getNext();
        }
        NodoC temp=new NodoC(p);
        temp.setNext(aux.getNext());
        aux.setNext(temp);
        temp.setNext(cabeza);
        temp=ultimo;     
    }
    
    public void consulta(){
        NodoC aux = cabeza;
        System.out.println("------------Lista de Clientes Registrados------------");
        while(aux != null){
            System.out.println(
                    "Cedula: "+aux.getDato().getCedula()+
                    "\n Nombre: "+ aux.getDato().getNombreC()+
                    "\n Fecha de nacimiento: "+ aux.getDato().getFechaNac()+
                    "\n Correo electrinico: "+ aux.getDato().getCorreo()+
                    "\n Categoria: "+ aux.getDato().getCategoria());
            System.out.println("-----------------------");
            
        }
    }

    @Override
    public String toString(){
        NodoC aux = cabeza;
        String s="Lista: ";
        if (aux != null){
            s+=aux+", ";
            aux=aux.getNext();
            while(aux != cabeza){
                s+=aux+", ";
                aux=aux.getNext();
            }
        } else{
            s+="vacia";
        }
        return s;
    } 
}
