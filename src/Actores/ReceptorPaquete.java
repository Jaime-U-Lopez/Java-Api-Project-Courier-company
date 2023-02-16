package Actores;

import Datos_Contacto.DatosContacto;
public class ReceptorPaquete extends  Persona{
    private String ciudadOrigen;
    private String ciudadDestino;
    private DatosContacto datosContacto;
    private String horaEntrega;

    public ReceptorPaquete(int cedula, String nombre, String apellido, String ciudadOrigen, String ciudadDestino, DatosContacto datosContacto, String horaEntrega) {
        super(cedula, nombre, apellido);
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.datosContacto = datosContacto;
        this.horaEntrega = horaEntrega;
    }

    @Override
    public String toString() {
        return "ReceptorPaquete{" +
                "ciudadOrigen='" + ciudadOrigen + '\'' +
                ", ciudadDestino='" + ciudadDestino + '\'' +
                ", datosContacto=" + datosContacto +
                ", horaEntrega='" + horaEntrega + '\'' +
                '}';
    }
}
