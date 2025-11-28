import java.util.ArrayList;
import java.util.Scanner;

public class CuestionarioList {
    static ArrayList <Coche> coches = new ArrayList<>();

    public static void main(String[] args) {
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
    
    static void agregar(Scanner sc) {
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        
        coches.add(new Coche(marca, modelo, precio));
        System.out.println("Coche Agregado");
    }

    static void listar(){
        if(coches.isEmpty()) {
            System.out.println("Coche a editar: ");
            return;
        }

        for(int i=0; i<coches.size(); i++){
            System.out.println((i+1) + ". " + coches.get(i));
        }
    } 

    static void editar(Scanner sc){
        listar();
        System.out.print("Coche que quiere editar: ");
        int pos = sc.nextInt() - 1;
        sc.nextLine();

        if(pos<0 || pos>=coches.size()) {
            System.out.println("Indice Incalido");
            return;
        }

        System.out.print("Nueva marca: ");
        coches.get(pos).setMarca(sc.nextLine());
        System.out.print("Nuevo modelo: ");
        coches.get(pos).setModelo(sc.nextLine());
        System.out.print("Nuevo precio: ");
        coches.get(pos).setPrecio(sc.nextDouble());
        sc.nextLine();

        System.out.println("Coche ACTUALIZADO");
    }

    static void eliminar(Scanner sc){
        listar();
        System.out.print("Coche que quiere eliminar: ");
        int pos = sc.nextInt() - 1;
        sc.nextLine();

        if(pos<0 || pos>=coches.size()) {
            System.out.println("Indice invalido");
            return;
        }

        coches.remove(pos);
        System.out.println("Coche eliminado");
    }
}