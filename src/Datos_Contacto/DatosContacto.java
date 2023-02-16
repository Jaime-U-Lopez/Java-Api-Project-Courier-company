package Datos_Contacto;

public  class DatosContacto {
    private long celular;
    private String correo;
    private Direccion direccion;

    public DatosContacto(long celular, String correo, Direccion direccion) {
        this.celular = celular;
        this.correo = correo;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "DatosContacto{" +
                "celular=" + celular +
                ", correo='" + correo + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
