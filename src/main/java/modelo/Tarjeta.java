package modelo;
import excepciones.DatoInvalidoException;

public class Tarjeta {

    private int numero;
    private String nombre;
    private String fecha;
    private String cvv;

    public Tarjeta(int numero,
                   String nombre,
                   String fecha,
                   String cvv)
            throws DatoInvalidoException {

        if (numero <= 0) {

            throw new DatoInvalidoException(
                    "Número de tarjeta inválido");
        }

        this.numero = numero;
        this.nombre = nombre;
        this.fecha = fecha;
        this.cvv = cvv;
    }
}