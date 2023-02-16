package Area_Paqueteria;

public class FacturaPaquete extends Paquete {

    private TipoPaquete tipoPaquete;

    public FacturaPaquete() {
        super();

    }

    public int valorAFacturar(TipoPaquete tipoPaquete) {

        switch (tipoPaquete) {

            case GRANDE:
                return 300000;
            case LIVIANO:
                return 100000;
            case MEDIANO:
                return 200000;
            default:
                return 0;

        }

    }

    public void generarFactura(TipoPaquete tipoPaquete) {


        switch (tipoPaquete) {

            case GRANDE:
                System.out.println("Factura generada en pdf por valor de $ = " + valorAFacturar(tipoPaquete) + " para el tiṕo de paquete  " + tipoPaquete);
                break;
            case LIVIANO:
                System.out.println("Factura generada en pdf por valor de $ = " + valorAFacturar(tipoPaquete) + " para el tiṕo de paquete " + tipoPaquete);
                break;
            case MEDIANO:
                System.out.println("Factura generada en pdf por valor de $ = " + valorAFacturar(tipoPaquete) + " para el tiṕo de paquete " + tipoPaquete);
                break;
            default:
                System.out.println("No le aplica Factura = ");
                break;
        }


    }
}
