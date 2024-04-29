package co.edu.uniquindio.poo;

public class Empleado extends Persona {
    public double salario;

    public Empleado(String nombre, String apellido, String dni, String direccion, String numeroTelefono, double salario) {
        super(nombre, apellido, dni, direccion, numeroTelefono);
        this.salario = salario;
    
    }
    
}
