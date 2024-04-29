package co.edu.uniquindio.poo;

public abstract class Producto {
    public String numeroIdentificacion;
    public String nombreProducto;
    public String descripcion;
    public double precio;
    public int cantidadStock;
    public String proovedor;


    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getCantidadStock() {
        return cantidadStock;
    }
    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    public String getProovedor() {
        return proovedor;
    }
    public void setProovedor(String proovedor) {
        this.proovedor = proovedor;
    }


    public Producto(String numeroIdentificacion, String nombreProducto, String descripcion, double precio,
            int cantidadStock, String proovedor) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.proovedor = proovedor;
    }

    
}
