package modelo;

public class Venta {

    private String fecha;
    private int monto;

    public Venta(String fecha,
                 int monto) {

        this.fecha = fecha;
        this.monto = monto;
    }

    public boolean anular() {

        return true;
    }
}