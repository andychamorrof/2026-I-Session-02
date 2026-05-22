package modelo;

import java.util.ArrayList;

public class Zona {

    private String nombre;
    private int capacidad;
    private int precio;

    private ArrayList<Entrada> entradas;

    public Zona(String nombre,
                int capacidad,
                int precio) {

        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;

        entradas = new ArrayList<>();
    }

    public Entrada[] generarEntradas() {

        for (int i = 1; i <= capacidad; i++) {

            entradas.add(new Entrada(i,
                    "Disponible"));
        }

        return entradas.toArray(new Entrada[0]);
    }

    public void mostrarEntrada() {

        for (Entrada e : entradas) {

            System.out.println(
                    "Entrada " + e.getNumero());
        }
    }

    public String getNombre() {

        return nombre;
    }
}
