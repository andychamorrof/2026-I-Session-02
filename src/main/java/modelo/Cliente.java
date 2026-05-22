package modelo;

import excepciones.EntradaLimiteException;

public class Cliente extends Persona {

    private int puntos;
    private Tarjeta tarjeta;

    public Cliente(String nombres,
                   String apellidos,
                   String dni,
                   String contrasenia,
                   int puntos) {

        super(nombres,
              apellidos,
              dni,
              contrasenia);

        this.puntos = puntos;
    }

    public void mostrarCliente() {

        System.out.println(
                "Cliente: " + nombres);
    }

    public void agregarTarjeta(Tarjeta tarjeta) {

        this.tarjeta = tarjeta;
    }
    
    @Override
    public Boolean comprar(int cantidad) throws EntradaLimiteException {
        if (cantidad > 4) {
            throw new EntradaLimiteException("Error en Cliente: No se pueden comprar mas de 4 entradas por transaccion.");
        }
        if (cantidad <= 0) {
            throw new EntradaLimiteException("Error en Cliente: La cantidad debe ser mayor a 0.");
        }
        return true;
    }
}
