public class NodoP {
 
    private Alquiler_Vehiculos dato;
    private NodoP siguiente;
    
    public NodoP(Alquiler_Vehiculos dato) {
        this.dato = dato;
    }

    public NodoP() {
    }

    public Alquiler_Vehiculos getDato() {
        return dato;
    }

    public void setDato(Alquiler_Vehiculos dato) {
        this.dato = dato;
    }

    public NodoP getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoP siguiente) {
        this.siguiente = siguiente;
    }
}
