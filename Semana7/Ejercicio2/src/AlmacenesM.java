public class AlmacenesM {

    public static final int NUM_ALMACENES = 5;
    public static final int NUM_PRODUCTOS = 2;

    private int[][] ventas;               
    private double[] precios;            
    private double[] ingresosPorAlmacen; 
    private double totalGlobal;

    private boolean ventasLeidas;
    private boolean preciosLeidos;
    private boolean ingresosCalculados;

    public AlmacenesM() {
        ventas = new int[NUM_ALMACENES][NUM_PRODUCTOS];
        precios = new double[NUM_PRODUCTOS];
        ingresosPorAlmacen = new double[NUM_ALMACENES];
        totalGlobal = 0.0;
        ventasLeidas = false;
        preciosLeidos = false;
        ingresosCalculados = false;
    }

    public void setVenta(int almacen, int producto, int unidades) {
        if (almacen < 0 || almacen >= NUM_ALMACENES ||
            producto < 0 || producto >= NUM_PRODUCTOS ||
            unidades < 0) {
            throw new IllegalArgumentException("Datos de venta invalidos");
        }
        ventas[almacen][producto] = unidades;
        ventasLeidas = true;
        ingresosCalculados = false;
    }

    public void setPrecio(int producto, double precio) {
        if (producto < 0 || producto >= NUM_PRODUCTOS || precio < 0) {
            throw new IllegalArgumentException("Precio invalido");
        }
        precios[producto] = precio;
        preciosLeidos = true;
        ingresosCalculados = false;
    }

    public boolean sePuedeCalcularIngresos() {
        return ventasLeidas && preciosLeidos;
    }

    public void calcularIngresos() {
        if (!sePuedeCalcularIngresos()) {
            throw new IllegalStateException("Faltan ventas o precios");
        }

        totalGlobal = 0.0;

        for (int a = 0; a < NUM_ALMACENES; a++) {
            double totalAlmacen = 0.0;
            for (int p = 0; p < NUM_PRODUCTOS; p++) {
                totalAlmacen += ventas[a][p] * precios[p];
            }
            ingresosPorAlmacen[a] = totalAlmacen;
            totalGlobal += totalAlmacen;
        }

        ingresosCalculados = true;
    }

    public boolean hayIngresosCalculados() {
        return ingresosCalculados;
    }

    public double[] getIngresosPorAlmacen() {
        return ingresosPorAlmacen;
    }

    public double getTotalGlobal() {
        return totalGlobal;
    }

    public int getUnidades(int almacen, int producto) {
        return ventas[almacen][producto];
    }

    public double getPrecio(int producto) {
        return precios[producto];
    }
}
