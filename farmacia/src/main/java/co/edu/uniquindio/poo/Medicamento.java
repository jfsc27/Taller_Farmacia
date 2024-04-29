package co.edu.uniquindio.poo;

public class Medicamento extends Producto {
    public double dosis;

    public Medicamento(String numeroIdentificacion, String nombreProducto, String descripcion, double precio,
            int cantidadStock, String proovedor, double dosis) {
        super(numeroIdentificacion, nombreProducto, descripcion, precio, cantidadStock, proovedor);
        this.dosis = dosis;
    }

    public double getDosis() {
        return dosis;
    }

    public void setDosis(double dosis) {
        this.dosis = dosis;
    }
    
    
}
