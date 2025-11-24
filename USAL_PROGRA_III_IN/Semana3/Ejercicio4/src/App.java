//Deberás crear una clase Person.java con atributos nombre altura y peso, sus correspondientes getters
//y setters. En el método main deberás instanciar 3 objetos de dicha clase y completar su información
//solicitándola al usuario por consola para cada objeto. Finalmente, deberás mostrar por consola quién
//es el más alto y quién es el que más pesa. Deberás utilizar siempre los getters y setters para obtener la
//información y establecerla en cada instancia de cada objeto.



import com.coti.tools.Esdia; 

public class App {
    public static void main(String[] args) throws Exception {
       
        Persona p1 =new Persona();
        Persona p2 =new Persona();
        Persona p3 =new Persona();

        p1.setNombre(Esdia.readString_ne("\n\nIntroduzca el nombre de la primera persona: "));
        p1.setPeso(Esdia.readFloat("\n\nIntroduzca el peso de la primera persona: "));
        p1.setAltura(Esdia.readFloat("\n\nIntroduzca la altura de la primera persona: "));

        p2.setNombre(Esdia.readString_ne("\n\nIntroduzca el nombre de la segunda persona: "));
        p2.setPeso(Esdia.readFloat("\n\nIntroduzca el peso de la segunda persona: "));
        p2.setAltura(Esdia.readFloat("\n\nIntroduzca la altura de la segunda persona: "));

        p3.setNombre(Esdia.readString_ne("\n\nIntroduzca el nombre de la tercera persona: "));
        p3.setPeso(Esdia.readFloat("\n\nIntroduzca el peso de la tercera persona: "));
        p3.setAltura(Esdia.readFloat("\n\nIntroduzca la altura de la tercera persona: "));

        System.out.println("La primera persona se llama: "+p1.getNombre()+
        ", pesa: "+p1.getPeso()+ " y mide: "+p1.getAltura());

        System.out.println("La primera persona se llama: "+p2.getNombre()+
        ", pesa: "+p2.getPeso()+ " y mide: "+p2.getAltura());

        System.out.println("La primera persona se llama: "+p3.getNombre()+
        ", pesa: "+p3.getPeso()+ " y mide: "+p3.getAltura());

        Persona masAlto = p1;
        if (p2.getAltura() > masAlto.getAltura()) {
            masAlto = p2;
        }
        if (p3.getAltura() > masAlto.getAltura()) {
            masAlto = p3;
        }

        Persona masPesado = p1;
        if (p2.getPeso() > masPesado.getPeso()) {
            masPesado = p2;
        }
        if (p3.getPeso() > masPesado.getPeso()) {
            masPesado = p3;
        }

        System.out.println("\nLa persona más alta es: " + masAlto.getNombre() + " (" + masAlto.getAltura() + " m)");
        System.out.println("La persona con más peso es: " + masPesado.getNombre() + " (" + masPesado.getPeso() + " kg)");

        
    }
}








