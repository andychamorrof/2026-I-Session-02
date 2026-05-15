package modelo;

public class Tarjeta {

    private int numero;
    private String nombre;
    private String fecha;
    private String cvv;

    public Tarjeta(int numero,
                   String nombre,
                   String fecha,
                   String cvv) {

        this.numero = numero;
        this.nombre = nombre;
        this.fecha = fecha;
        this.cvv = cvv;
    }
}