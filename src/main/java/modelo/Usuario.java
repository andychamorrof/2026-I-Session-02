package modelo;

import excepciones.EntradaLimiteException;

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
    
    @Override
    public Boolean comprar(int cantidad) throws EntradaLimiteException {
        
        if (cantidad > 4) {
            throw new EntradaLimiteException("Error en Usuario: Límite excedido. El maximo permitido es 4 entradas.");
        }
        
        if (cantidad <= 0) {
            throw new EntradaLimiteException("Error en Usuario: Cantidad invalida.");
        }
        
        return true;
    }
}