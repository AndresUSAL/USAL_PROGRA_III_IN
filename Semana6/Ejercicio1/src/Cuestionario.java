import java.util.Scanner;

public class Cuestionario {
    
    private static Coche[] coches = new Coche[50];
    private static int cantidad =0;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1) Agregar Choche");
            System.out.println("2) Listar Coches");
            System.out.println("3) Editar Coche");
            System.out.println("4) Eliminar Coche");
            System.out.println("5) Salir");
            System.out.println("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1 -> agregar(sc);
                case 2 -> listar();
                case 3 -> editar(sc);
                case 4 -> eliminar(sc);
            }
        } while(opcion != 5);
   }
   private static void agregar(Scanner sc) {
    System.out.print("Marca: ");
    String marca = sc.nextLine();
    System.out.print("Modelo: ");
    String modelo = sc.nextLine();
    System.out.print("Precio: ");
    double precio = sc.nextDouble();
    sc.nextLine();

    coches[cantidad++] = new  Coche(marca, modelo, precio);
    System.out.println("Coche Agregado");
    }
    public static void listar(){
        if(cantidad == 0) {
            System.out.println("no hay coches");
            return;
        }

        for (int i=0; i<cantidad; i++) {
            System.out.println((i+1) + ". " + coches[i]);
        }
    }

    private static void editar(Scanner sc) {
        listar();
        System.out.println("numero de coche para editar: ");
        int pos = sc.nextInt() - 1;
        sc.nextLine();

        if(pos<0 || pos>=cantidad) {
            System.out.println("Pocicion invalida");
            return;
        }

        System.out.print("Nueva Marca: ");
        coches[pos].setMarca(sc.nextLine());
        System.out.print("Nuevo Modelo: ");
        coches[pos].setModelo(sc.nextLine());
        System.out.print("Nueco Precio: ");
        coches[pos].setPrecio(sc.nextDouble());
        sc.nextLine();

        System.out.println("Coche actualizado");
    }

    private static void eliminar(Scanner sc) {
        listar();
        System.out.print("Numero de cohce que se va a eliminar: ");
        int pos = sc.nextInt() - 1;
        sc.nextLine();

        if(pos<0 || pos>=cantidad) {
            System.out.println("Pocicion Invalida");
            return;
        }

        for(int i=pos; i<cantidad-1; i++) {
            coches[i] =coches[i+1];
        } 
        cantidad--;

        System.out.println("Coche eliminado");
    }
}
