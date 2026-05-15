package modelo;

public class Entrada {

    private int numero;
    private String estado;

    public Entrada(int numero,
                   String estado) {

        this.numero = numero;
        this.estado = estado;
    }

    public boolean vender() {

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
