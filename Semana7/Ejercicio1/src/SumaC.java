public class SumaC {

    private SumaM modelo;
    private SumaV vista;

    public SumaC(SumaM modelo, SumaV vista) {
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
                    leerNumeros();
                    break;
                case '2':
                    calcularSuma();
                    break;
                case '3':
                    mostrarResultado();
                    break;
                case 'q':
                case 'Q':
                    salir = true;
                    break;
                default:
                    vista.mostrarMensajeError("Opción no válida...");
            }
            System.out.println();
        }
    }

    private void leerNumeros() {
        int n1 = vista.leerNumero("Introduce el primer numero: ");
        int n2 = vista.leerNumero("Introduce el segundo numero: ");
        modelo.setNumeros(n1, n2);
        vista.mostrarMensaje("Numeros guardados correctamente");
    }

    private void calcularSuma() {
        if (!modelo.hayNumeros()) {
            vista.mostrarMensajeError("Primero leer los numeros (opcion 1)");
            return;
        }
        modelo.calcularSuma();
        vista.mostrarMensaje("Suma calculada");
    }

    private void mostrarResultado() {
        if (!modelo.hayResultado()) {
            vista.mostrarMensajeError("Primero calcular la suma (opción 2)");
            return;
        }
        int res = modelo.getResultado();
        vista.mostrarResultado(res);
    }
}
