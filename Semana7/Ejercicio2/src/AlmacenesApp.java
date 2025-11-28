/*Una compañía tiene cinco almacenes, cada uno de los cuales vende dos productos. En cada
almacén, se dispone de una tabla para almacenar las ventas por unidades de los dos
productos. Se dispone también de los precios que tiene cada unidad de los dos productos
igual para todos los almacenes. Es necesaria la creación de una aplicación con el siguiente
menú:
1.- Leer tabla de ventas
2.- Leer tabla de precios
3.- Calcular ingresos totales
4.- Mostrar resultados
q.- Salir*/


public class AlmacenesApp {

    public static void main(String[] args) {
        AlmacenesM modelo = new AlmacenesM();
        AlmacenesV vista = new AlmacenesV();
        AlmacenesC controlador = new AlmacenesC(modelo, vista);
        controlador.iniciar();
    }

}


