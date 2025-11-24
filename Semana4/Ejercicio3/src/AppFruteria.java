package Semana4.Ejercicio3.src;
//Una frutería precisa de un programa que calcule la factura de la compra de sus clientes. La frutería sólo trabaja con
//dos productos: peras y manzanas cuyo valor varía cada día. El programa pedirá por consola al tendero el precio/kg
//sin IVA de las peras y las manzanas cada mañana al comienzo de su jornada laboral. El IVA ya está prefijado en el
//programa. Posteriormente el programa permite introducir la cantidad de cada tipo de fruta que desea comprar
//cada cliente y calculará el precio total de la factura para dicho cliente, mostrando en forma de tabla el tipo de fruta,
//cantidad en Kg, precio con IVA por Kg, precio total por fruta. Haz que el programa se ejecute continuamente hasta
//que el tendero decida salir, incrementando el número de cliente mostrado en el ticket mostrado por pantalla.
//Tip: Realizar este ejercicio empleando Arrays de objetos y empleando una clase que abstraiga todo lo común que
//tienen los ítems que vende el tendero: e.g. Producto. TIP2: Usa String.format y especificadores de formato y
//especifica el ancho del campo %10s, %10.2f etc. para la tabla.
//|---------------------------------------------------|
//| Cliente | 1 |
//|---------------------------------------------------|
//| Manzanas | 2 kg | precio Kg con IVA 1,99 | 3,98 € |
//| Peras | 3 kg | precio Kg con IVA 2,25 | 6,75 € |
//|---------------------------------------------------|
//| Total con IVA 10,73 € |
//|---------------------------------------------------|

import java.util.Scanner;
import fruteria.Producto;
import com.coti.tools.Esdia;

public class AppFruteria {

    public static void main(String[] args) {
        System.out.println("Moneda: €");

        int numeroProductos = Esdia.readInt("Introduzca el número de productos diferentes que vende la frutería: ");

        Producto[] productos = new Producto[numeroProductos];

        for (int i = 0; i < numeroProductos; i++) {
            String nombreProducto = Esdia.readString("Introduzca el nombre del producto: ");
            double precioSinIVA = Esdia.readDouble("Introduzca el precio por kg sin IVA del producto: ");
            productos[i] = new Producto(nombreProducto, precioSinIVA);
        }

        int numeroCliente = 1;
        boolean continuar = true;

        while (continuar) {

            for (int i = 0; i < productos.length; i++) {
                double cantidad = Esdia.readDouble("Introduzca la cantidad de " + productos[i].getNombre() + " en kg: ");
                productos[i].setCantidad(cantidad);
            }

            mostrarTicket(numeroCliente, productos);

            numeroCliente++;
            continuar = Esdia.siOno("¿Desea continuar? (s/n): ");
        }
    }

    private static void mostrarTicket(int numeroCliente, Producto[] productos) {

        String lineaSeparacion = "+" + "-".repeat(120) + "+";
        String lineaCliente = "| Cliente %-100s | %7s |";
        System.out.println(lineaSeparacion);
        System.out.println(String.format(lineaCliente, "", numeroCliente));
        System.out.println(lineaSeparacion);

        for (Producto producto : productos) {
            System.out.println(String.format("| %-20.20s | %-10.2f %10.10s | %35.35s %10.2f | %20.2f € |", 
            producto.getNombre(), 
            producto.getCantidad(), "kg",
            "precio Kg con IVA", producto.getPrecioConIVA(),
            producto.getPrecioTotal()));
        }

        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecioTotalConIVA();
        }
        System.out.println(lineaSeparacion);

        System.out.println(String.format("| %-93s | %20s € |", "Total con IVA", total));
        System.out.println(lineaSeparacion);

    }

}
