/**
 *
 * @author melan
 */
public class Vehiculo {
    private String placa, marca, modelo, color, combustible;
    private int año, cilindrada, catPasajeros, precioXdia;
    
    private String extras, estadoAsociado;

    public Vehiculo(String placa, String marca, String modelo, String color, 
            String combustible, int año, int cilindrada, int capPasajeros, 
            int precioXdia, String extras, String estadoAsociado) {
        
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
        this.año = año;
        this.cilindrada = cilindrada;
        this.catPasajeros = capPasajeros;
        this.precioXdia = precioXdia;
        this.extras = extras;
        this.estadoAsociado = estadoAsociado;
    }

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCatPasajeros() {
        return catPasajeros;
    }

    public void setCatPasajeros(int catPasajeros) {
        this.catPasajeros = catPasajeros;
    }

    public int getPrecioXdia() {
        return precioXdia;
    }

    public void setPrecioXdia(int precioXdia) {
        this.precioXdia = precioXdia;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getEstadoAsociado() {
        return estadoAsociado;
    }

    public void setEstadoAsociado(String estadoAsociado) {
        this.estadoAsociado = estadoAsociado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", marca=" + marca + ", "
                + "modelo=" + modelo + ", color=" + color + ", combustible=" + 
                combustible + ", a\u00f1o=" + año + ", cilindrada=" + cilindrada 
                + ", catPasajeros=" + catPasajeros + ", precioXdia=" + precioXdia 
                + ", extras=" + extras + ", estadoAsociado=" + estadoAsociado + '}';
    }  
}
