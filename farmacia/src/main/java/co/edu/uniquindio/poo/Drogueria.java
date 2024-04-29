package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Drogueria {
    public String nombre;
    public Collection<Producto> listaProductos;
    public Collection<Pedido> listaPedidos;
    public Collection<Cliente> listaClientes;
    public Collection<Empleado> listaEmpleados;


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Collection<Producto> getListaProductos() {
        return listaProductos;
    }
    public void setListaProductos(Collection<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    public Collection<Pedido> getListaPedidos() {
        return listaPedidos;
    }
    public void setListaPedidos(Collection<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
    public Collection<Cliente> getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(Collection<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    public void setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    public Drogueria(String nombre) {
        this.nombre = nombre;
        this.listaProductos = new LinkedList<Producto>();
        this.listaPedidos = new LinkedList<Pedido>();
        this.listaClientes = new LinkedList<Cliente>();
        this.listaEmpleados = new LinkedList<Empleado>();
    }

    public Collection<Producto> getStockMayor100 (){
        return listaProductos.stream().filter(producto -> producto.getCantidadStock() > 100).collect(Collectors.toList());
    }
    public void agregarProducto(Producto producto) {
        listaProductos.add (producto);
    }
    public void agregarPedido(Pedido pedido) {
        listaPedidos.add (pedido);
    }

    
    
}
