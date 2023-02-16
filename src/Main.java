import Actores.*;
import Area_Paqueteria.*;
import Datos_Contacto.DatosContacto;
import Datos_Contacto.Direccion;

public class Main {
    public static void main(String[] args) {

        //Empresa de envio de paquetes

        // juan desean enviar una encomienda Pero antes
        // debe diligenciar la siguiente informacion::

        Direccion direccionJuan = new Direccion("car34 calle 455", "medellin");
        DatosContacto datosContactoJuan = new DatosContacto(31090787l, "or4846@Gmail.com", direccionJuan);
        Cliente JuanManuel = new Cliente(1223444, "Juan Manuel", "Domingo", datosContactoJuan);
        System.out.println("\n Datos del cliente = \n" + JuanManuel.toString());
        // Paquete que enviara Juan, se
        // debe diligenciar la siguiente informacion:

        Paquete paqueteJuanConfites = new Paquete(TipoPaquete.MEDIANO, 455, 450000);

        // para que Persona se enviara el paquete

        Direccion direccionDora= new Direccion("cr44 call 98 bocachico","bogota");
        DatosContacto datosDora = new DatosContacto(3432423423423l,"Or55656QGmail",direccionDora);
        ReceptorPaquete TiaDora = new ReceptorPaquete(1312312,"Dora","domingo","medellin", "bogota", datosDora,"5pm");



        // Empresa=

        // EL PAQUETE lo recibe el taquillero :

        Empleado Santiago = new Empleado(1212222, "santiago", "urrutia", 2, "sd" +
                "A+", TipoEmpleado.TAQUILLERO);

        System.out.println("\n Empleado que recibe el paquete  = \n" + Santiago.toString());
        // El empleado calcula el valor :

        FacturaPaquete factura1 = new FacturaPaquete();
         factura1.generarFactura(TipoPaquete.MEDIANO);

        // El Taquillero envia el paquete al area de paqueteria

        Empleado Pedro = new Empleado(233423, "pedro", "Domingo", 4, "A-", TipoEmpleado.REPARTIDOR);
        System.out.println("\n Empleado que alista el paquete en el vehiculo = \n" + Pedro.toString());
        Empleado Alberto = new Empleado(123131, "Alberto","lopez,",5,"a-", TipoEmpleado.CONDUCTOR);
        System.out.println("\n Vehiculo conducido por  = \n" + Alberto.toString());
        // Transporte Coordinado por
        Empleado Jaime = new Empleado(232342,"jaime","lopez;",76,"A-",TipoEmpleado.COORDINADOR);
        System.out.println("\n Empleado que Coordina el envió =\n " + Jaime);
        EnvioPaquete envioPaquete = new EnvioPaquete("34",JuanManuel,TiaDora,paqueteJuanConfites,334343,EstadoEnvio.EN_RUTA  );

        System.out.println("\nEnvioPaquete inicio = \n " + envioPaquete);






    }
}
