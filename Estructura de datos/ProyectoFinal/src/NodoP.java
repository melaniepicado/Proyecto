public class NodoP {
 
    private String Letra;
    private NodoP siguiente;
    
    public NodoP() {
        this.Letra = "";
        this.siguiente = null;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    public NodoP getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoP siguiente) {
        this.siguiente = siguiente;
    }    
}
