package modelo;

public class Cliente extends Persona {

    private int puntos;
    private Tarjeta tarjeta;

    public Cliente(String nombres,
                   String apellidos,
                   String dni,
                   String contrasenia,
                   int puntos) {

        super(nombres, apellidos, dni, contrasenia);

        this.puntos = puntos;
    }

    public void ingresar(String usuario,
                          String clave) {

        System.out.println("Cliente ingresó");
    }
}
