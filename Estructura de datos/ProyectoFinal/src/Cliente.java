/**
 *
 * @author MIKE-PC
 */
public class Cliente {
    
    private int cedula;
    private String NombreC;
    private String FechaNac;
    private String correo;
    private String categoria;

    public Cliente(int cedula, String NombreC, String FechaNac, String correo, String categoria) {
        this.cedula = cedula;
        this.NombreC = NombreC;
        this.FechaNac = FechaNac;
        this.correo = correo;
        this.categoria = categoria;
    }

    public Cliente() {
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombreC() {
        return NombreC;
    }

    public void setNombreC(String NombreC) {
        this.NombreC = NombreC;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", NombreC=" + NombreC + 
                ", FechaNac=" + FechaNac + ", correo=" + correo + ", "
                + "categoria=" + categoria + '}';
    }
    
}
