//Crea un proyecto con dos paquetes (paquete1 y paquete2) y las siguientes clases en cada uno de ellos:
//paquete1:
//● Clase1: modificador public con cuatro atributos con modificadores public, sin modificador,
//protected y private respectivamente. Del mismo modo cuatro métodos con dichos
//modificadores de visibilidad. Estos pueden no realizar nada.
//● Clase2: sin modificador en la clase y con los mismos atributos y métodos que la anterior.
//paquete2:
//● App.java con un método main desde el que habrá que intentar:
//○ importar la Clase1. ¿Qué sucede?
//○ importar la Clase2 ¿Qué sucede?
//○ Acceder a todos los atributos y métodos de un objeto de la Clase1.
//¿Qué sucede en cada caso? Revisa la teoría y los modificadores de visibilidad.
//Razona cuál es el propósito de los modificadores de visibilidad y da un posible ejemplo.

package paquete2;

import paquete1.Clase1;

public class App {
    public static void main(String[] args){
        Clase1 c1 = new Clase1();


            c1.atr_pub = 10;

            //c1.atr_priv = 10;

            //c1.atr.nad = 10;

            //c1.atr.poct = 10;


            c1.metodo_pub();

            //c1.metodo_priv();

            //c1.metodo.nad(;)

            //c1.metodo.proct();


/* public class Persona { //Posible ejemplo
    private String nombre;    // nadie puede tocarlo directamente desde fuera
    private int edad;
            
    public String getNombre() {
        return nombre;
        }
            
    public void setNombre(String nombre) {
        this.nombre = nombre;
        }
            
    public int getEdad() {
        return edad;
        }
            
    public void setEdad(int edad) {
        if (edad >= 0) {      // regla de negocio
            this.edad = edad;
            }
        }
    }
    */  
    
    }

}

