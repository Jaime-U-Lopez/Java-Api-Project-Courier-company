package Actores;

import  Datos_Contacto.DatosContacto;
public class Cliente extends Persona{
    private DatosContacto datosContacto;

    public Cliente(int cedula, String nombre, String apellido, DatosContacto datosContacto) {
        super(cedula, nombre, apellido);
        this.datosContacto = datosContacto;
    }

    @Override
    public String toString() {
        return "Cliente " + super.toString()+
                "datosContacto=" + datosContacto +
                '\n';
    }
}
