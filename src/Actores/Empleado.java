package Actores;

public class Empleado extends Persona {

    private int Antiguedad;
    private String TipoSangre;
    private  TipoEmpleado tipoEmpleado;


    public Empleado(int cedula, String nombre, String apellido, int antiguedad, String tipoSangre, TipoEmpleado tipoEmpleado) {
        super(cedula, nombre, apellido);
        Antiguedad = antiguedad;
        TipoSangre = tipoSangre;
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
    public String toString() {
        return   "Empleado = " +super.toString()+
                ", tipoEmpleado=" + tipoEmpleado +
                '}';
    }
}
