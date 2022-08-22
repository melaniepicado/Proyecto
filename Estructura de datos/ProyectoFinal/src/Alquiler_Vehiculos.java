public class Alquiler_Vehiculos {
    private String Cedula, Días_de_alquiler,Marca_del_vehículo,
            Modelo_del_vehículo, Cantidad_de_pasajeros, Extras;

    public Alquiler_Vehiculos(String Cedula, String Días_de_alquiler, String Marca_del_vehículo, 
            String Modelo_del_vehículo, String Cantidad_de_pasajeros, String Extras) {
        this.Cedula = Cedula;
        this.Días_de_alquiler = Días_de_alquiler;
        this.Marca_del_vehículo = Marca_del_vehículo;
        this.Modelo_del_vehículo = Modelo_del_vehículo;
        this.Cantidad_de_pasajeros = Cantidad_de_pasajeros;
        this.Extras = Extras;
    }

    public String getDías_de_alquiler() {
        return Días_de_alquiler;
    }

    public void setDías_de_alquiler(String Días_de_alquiler) {
        this.Días_de_alquiler = Días_de_alquiler;
    }

    public String getMarca_del_vehículo() {
        return Marca_del_vehículo;
    }

    public void setMarca_del_vehículo(String Marca_del_vehículo) {
        this.Marca_del_vehículo = Marca_del_vehículo;
    }

    public String getModelo_del_vehículo() {
        return Modelo_del_vehículo;
    }

    public void setModelo_del_vehículo(String Modelo_del_vehículo) {
        this.Modelo_del_vehículo = Modelo_del_vehículo;
    }

    public String getCantidad_de_pasajeros() {
        return Cantidad_de_pasajeros;
    }

    public void setCantidad_de_pasajeros(String Cantidad_de_pasajeros) {
        this.Cantidad_de_pasajeros = Cantidad_de_pasajeros;
    }

    public String getExtras() {
        return Extras;
    }

    public void setExtras(String Extras) {
        this.Extras = Extras;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    @Override
    public String toString() {
        return "Cedula del cliente: " + Cedula+
                "\nDías_de_alquiler: " + Días_de_alquiler + 
                "\nMarca_del_vehículo: " + Marca_del_vehículo + 
                "\nModelo_del_vehículo: " + Modelo_del_vehículo + 
                "\nCantidad_de_pasajeros: " + Cantidad_de_pasajeros + 
                "\nExtras: " + Extras;
    }
    
}
