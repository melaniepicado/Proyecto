public class Alquiler_Vehiculos {
    private String Días_de_alquiler,Marca_del_vehículo,
            Modelo_del_vehículo, Cantidad_de_pasajeros, Extras;

    public Alquiler_Vehiculos(String Días_de_alquiler, String Marca_del_vehículo, 
            String Modelo_del_vehículo, String Cantidad_de_pasajeros, String Extras) {
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
    
    @Override
    public String toString() {
        return "Alquiler_Vehiculos{" + "Días_de_alquiler=" + Días_de_alquiler 
                + ", Marca_del_vehículo=" + Marca_del_vehículo + ", Modelo_del_vehículo=" 
                + Modelo_del_vehículo + ", Cantidad_de_pasajeros=" + Cantidad_de_pasajeros + 
                ", Extras=" + Extras + '}';
    }
}
