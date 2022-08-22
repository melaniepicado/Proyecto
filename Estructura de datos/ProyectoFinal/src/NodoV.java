/**
 *
 * @author melan
 */
public class NodoV {
    private Vehiculo dato;
    private NodoV atras;

    public NodoV() {
        this.dato = dato;
    }

    public Vehiculo getDato() {
        return dato;
    }

    public void setDato(Vehiculo dato) {
        this.dato = dato;
    }

    public NodoV getAtras() {
        return atras;
    }

    public void setAtras(NodoV atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return "" + dato;
    }
}
