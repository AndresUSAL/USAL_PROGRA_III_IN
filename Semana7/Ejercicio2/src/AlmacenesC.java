public class AlmacenesC {

    private AlmacenesM modelo;
    private AlmacenesV vista;

    public AlmacenesC(AlmacenesM modelo, AlmacenesV vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            vista.mostrarMenu();
            char opcion = vista.leerOpcion();

            switch (opcion) {
                case '1':
                    leerVentas();
                    break;
                case '2':
                    leerPrecios();
                    break;
                case '3':
                    calcularIngresos();
                    break;
                case '4':
                    mostrarResultados();
                    break;
                case 'q':
                case 'Q':
                    salir = true;
                    break;
                default:
                    vista.mostrarError("Opcion invalida");
            }
            System.out.println();
        }
    }

    private void leerVentas() {
        for (int a = 0; a < AlmacenesM.NUM_ALMACENES; a++) {
            for (int p = 0; p < AlmacenesM.NUM_PRODUCTOS; p++) {
                int unidades = vista.pedirUnidades(a, p);
                modelo.setVenta(a, p, unidades);
            }
        }
        vista.mostrarMensaje("Ventas guardadas");
    }

    private void leerPrecios() {
        for (int p = 0; p < AlmacenesM.NUM_PRODUCTOS; p++) {
            double precio = vista.pedirPrecio(p);
            modelo.setPrecio(p, precio);
        }
        vista.mostrarMensaje("Precios guardados");
    }

    private void calcularIngresos() {
        if (!modelo.sePuedeCalcularIngresos()) {
            vista.mostrarError("No se pueden calcular los ingresos, lee antes ventas y precios");
            return;
        }

        modelo.calcularIngresos();
        vista.mostrarMensaje("Ingresos calculados...");
    }

    private void mostrarResultados() {
        if (!modelo.hayIngresosCalculados()) {
            vista.mostrarError("Aun no se han calculado los ingresos");
            return;
        }

        vista.mostrarIngresos(
                modelo.getIngresosPorAlmacen(),
                modelo.getTotalGlobal()
        );
    }
}
