package modelo;

import java.util.ArrayList;

public class Concierto {

    private String nombre;
    private String fecha;

    private ArrayList<Zona> zonas;

    public Concierto(String nombre,
                     String fecha) {

        this.nombre = nombre;
        this.fecha = fecha;

        zonas = new ArrayList<>();
    }

    public boolean agregarZona(Zona zona) {

        return zonas.add(zona);
    }
}
