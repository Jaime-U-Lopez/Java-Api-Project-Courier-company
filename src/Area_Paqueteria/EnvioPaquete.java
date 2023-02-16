package Area_Paqueteria;

import Actores.Cliente;
import Actores.ReceptorPaquete;

public class EnvioPaquete {

    private String numeroGuia;
    private Cliente cliente;
    private ReceptorPaquete receptorPaquete;

    private Paquete paquete;
    private  int  valorEnvio;
    private EstadoEnvio estadoEnvio;

    public EnvioPaquete(String numeroGuia, Cliente cliente, ReceptorPaquete receptorPaquete, Paquete paquete, int valorEnvio, EstadoEnvio estadoEnvio) {
        this.numeroGuia = numeroGuia;
        this.cliente = cliente;
        this.receptorPaquete = receptorPaquete;
        this.paquete = paquete;
        this.valorEnvio = valorEnvio;
        this.estadoEnvio = estadoEnvio;
    }

    @Override
    public String toString() {
        return "" +
                "numeroGuia='" + numeroGuia + '\'' +
                ", cliente=" + cliente +
                ",\n receptorPaquete=" + receptorPaquete +
                ",\n Paquete=" + paquete +
                ",\n ValorEnvio=" + valorEnvio +
                ",\n EstadoEnvio=" + estadoEnvio +
                '\n';
    }
}
