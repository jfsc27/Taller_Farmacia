package co.edu.uniquindio.poo;

public class CuidadoPersonal extends Producto {
    public String ingredientes;

    public CuidadoPersonal(String numeroIdentificacion, String nombreProducto, String descripcion, double precio, int cantidadStock, String proovedor, String ingredientes) {
        super(numeroIdentificacion, nombreProducto, descripcion, precio, cantidadStock, proovedor);
        this.ingredientes = ingredientes;
    }

}
