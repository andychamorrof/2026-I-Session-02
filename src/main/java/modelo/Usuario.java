package modelo;

public class Usuario extends Persona {

    private boolean estado;

    public Usuario(String nombres,
                   String apellidos,
                   String dni,
                   String contrasenia,
                   boolean estado) {

        super(nombres, apellidos, dni, contrasenia);

        this.estado = estado;
    }

    public void registrarZonas() {

        System.out.println("Zona registrada");
    }
}