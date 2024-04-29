package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


public class DrogueriaTest {
    private static final Logger LOG = Logger.getLogger(Drogueria.class.getName());

    @Test
    public void pedidoSinStock() {
        LOG.info("Iniciado test para no aceptar productos sin stock");

        assertThrows(Throwable.class, () -> new Pedido(LocalDate.of(21, 02, 2023), 3, new Medicamento("2730", "Acetaminofem", "pastas", 2.500, 0, "Bayer", 2), new Cliente("Camilo", "Rodriguez", "1094883581", "La patria", "3103396739")));

        LOG.info("Finalizando test para no aceptar productos sin stock");
    }

    @Test
    public void pedidoStock100 (){
        LOG.info("Iniciado test para generar una lista con los productos con mas de 100 unidades en stock");
        Drogueria drogueria = new Drogueria("La rebaja");

        CuidadoPersonal cuidadoPersonal = new CuidadoPersonal("2433", "Shampoo", "Producto para lavar el cabello", 20.000, 299, "Old's pice", "Jabon");

        Hogar hogar = new Hogar("1245", "Fabuloso", "Producto para limpiar el piso", 5.700, 101, "Bayer", "Echar en el piso y trapear");

        Medicamento medicamento = new Medicamento("3948", "Acetaminofem", "Pastas para el dolor", 700, 34, "Bayer", 1);

        drogueria.agregarProducto (cuidadoPersonal);
        drogueria.agregarProducto (hogar);
        drogueria.agregarProducto (medicamento);

        Collection<Producto> listaEsperada = List.of(cuidadoPersonal, hogar);
        assertIterableEquals(listaEsperada, drogueria.getStockMayor100());

        LOG.info("Finalizando test para generar una lista con los productos con mas de 100 unidades en stock");
    }

    @Test
    public void calcularValorPedido (){
        LOG.info("Iniciando test para calcular el costo de un pedido");

        Drogueria drogueria = new Drogueria("La rebaja");

        Pedido pedido = new Pedido(LocalDate.now(), 7, new Medicamento("2435", "Acetaminofem", "Pastas para el dolor de cabeza", 800, 23, "Bayer", 1), new Cliente("Juan", "Smith", "1094883581", "La patria", "3103396739"));

        drogueria.agregarPedido (pedido);

        assertEquals(5600, pedido.calcularTotalPedido());

        LOG.info("Finalizando test para calcular el costo de un pedido");
    }

}
