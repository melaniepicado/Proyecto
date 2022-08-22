/**
 *
 * @author MIKE-PC
 */
public class NodoC {
    
    private Cliente dato;
    private NodoC next;
    
    
    @Override
    public String toString(){
        return "Nodo{"+"dato="+dato+'}';
    }
    
    public NodoC(Cliente dato){
        this.dato=dato;
    }

    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public NodoC getNext() {
        return next;
    }

    public void setNext(NodoC next) {
        this.next = next;
    }
}
