package co.edu.uniquindio.poo;

public class Hogar extends Producto {
    public String indicaciones;

    public Hogar(String numeroIdentificacion, String nombreProducto, String descripcion, double precio,
            int cantidadStock, String proovedor, String indicaciones) {
        super(numeroIdentificacion, nombreProducto, descripcion, precio, cantidadStock, proovedor);
        this.indicaciones = indicaciones;
    
    }
    
}
