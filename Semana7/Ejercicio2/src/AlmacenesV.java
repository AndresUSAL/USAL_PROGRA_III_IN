import java.util.Scanner;

public class AlmacenesV {

    private Scanner sc;

    public AlmacenesV() {
        sc = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("===== MENU ALMACENES =====");
        System.out.println("1) Leer tabla de ventas");
        System.out.println("2) Leer tabla de precios");
        System.out.println("3) Calcular ingresos totales");
        System.out.println("4) Mostrar resultados");
        System.out.println("q) Salir");
        System.out.print("Opcion: ");
    }

    public char leerOpcion() {
        String linea = sc.nextLine();
        if (linea.isEmpty()) return ' ';
        return linea.charAt(0);
    }

    public int pedirUnidades(int numAlmacen, int numProducto) {
        while (true) {
            System.out.print("Unidades vendidas en almacen " + (numAlmacen + 1) +
                             ", producto " + (numProducto + 1) + ": ");
            String linea = sc.nextLine();
            try {
                int unidades = Integer.parseInt(linea.trim());
                if (unidades < 0) {
                    System.err.println("Las unidades no pueden ser negativas");
                } else {
                    return unidades;
                }
            } catch (NumberFormatException e) {
                System.err.println("Introduce un entero valido");
            }
        }
    }

    public double pedirPrecio(int numProducto) {
        while (true) {
            System.out.print("Precio del producto " + (numProducto + 1) + ": ");
            String linea = sc.nextLine();
            try {
                double precio = Double.parseDouble(linea.trim());
                if (precio < 0) {
                    System.err.println("El precio no puede ser negativo");
                } else {
                    return precio;
                }
            } catch (NumberFormatException e) {
                System.err.println("Introduce un número válido");
            }
        }
    }

    public void mostrarIngresos(double[] ingresosPorAlmacen, double totalGlobal) {
        System.out.println("===== Ingresos =====");
        for (int i = 0; i < ingresosPorAlmacen.length; i++) {
            System.out.println("Almacen " + (i + 1) + ": " + ingresosPorAlmacen[i]);
        }
        System.out.println("Total global: " + totalGlobal);
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public void mostrarError(String msg) {
        System.err.println(msg);
    }
}
