package Datos_Contacto;

public class Direccion {

    private String  direccion;
    private  String ciudad;

    public Direccion(String direccion, String ciudad) {
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
