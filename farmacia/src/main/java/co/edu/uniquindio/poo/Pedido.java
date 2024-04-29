package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {
    public LocalDate fecha;
    public int cantidad;
    private final Producto producto;
    private final Cliente cliente;
    
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Producto getProducto() {
        return producto;
    }
    public Cliente getCliente (){
        return cliente;
    }

    public Pedido(LocalDate fecha, int cantidad, Producto producto, Cliente cliente) {

        this.fecha = fecha;
        this.cantidad = cantidad;
        this.producto = producto;
        assert producto.getCantidadStock() > 0;
        this.cliente = cliente;

    }

    public double calcularTotalPedido (){
        return (getCantidad() * producto.getPrecio());
    }
    

}
