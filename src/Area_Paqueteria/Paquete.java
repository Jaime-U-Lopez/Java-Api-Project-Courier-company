package Area_Paqueteria;

public class Paquete {

    private int id_Paquete;
    private static int contadorID;
    private TipoPaquete tipoPaquete;
    private int pesoPaquete;
    private int valorDeclarado;


    public Paquete(){

    }
    public Paquete(TipoPaquete tipoPaquete, int pesoPaquete, int valorDeclarado) {
        this.id_Paquete = ++Paquete.contadorID;
        this.tipoPaquete = tipoPaquete;
        this.pesoPaquete = pesoPaquete;
        this.valorDeclarado = valorDeclarado;
    }





    @Override
    public String toString() {
        return "Paquete{" +
                "id_Paquete=" + id_Paquete +
                ", tipoPaquete=" + tipoPaquete +
                ", pesoPaquete=" + pesoPaquete +
                ", valorDeclarado=" + valorDeclarado +
                '}';
    }
}
