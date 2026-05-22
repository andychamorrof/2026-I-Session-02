package modelo;
import excepciones.EntradaNoDisponibleException;

public class Entrada {

    private int numero;
    private String estado;

    public Entrada(int numero,
                   String estado) {

        this.numero = numero;
        this.estado = estado;
    }

    public boolean vender()
            throws EntradaNoDisponibleException {

        if (estado.equals("Vendido")) {

            throw new EntradaNoDisponibleException(
                    "La entrada ya fue vendida");
        }

        estado = "Vendido";

        return true;
    }

    public boolean liberar() {

        estado = "Disponible";
        return true;
    }

    public int getNumero() {

        return numero;
    }
}
