package modelo;

public abstract class Persona {

    protected String nombres;
    protected String apellidos;
    protected String dni;
    protected String contrasenia;

    public Persona(String nombres,
                   String apellidos,
                   String dni,
                   String contrasenia) {

        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.contrasenia = contrasenia;
    }

    public boolean registrarTarjeta() {
        return true;
    }

    public boolean eliminarTarjeta() {
        return true;
    }

    public boolean anularVenta() {
        return true;
    }
}
