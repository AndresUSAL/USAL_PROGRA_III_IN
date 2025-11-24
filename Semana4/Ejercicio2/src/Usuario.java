//Programa que recibe por línea de órdenes como parámetros el nombre, el peso y la altura de del usuario. El
//programa deberá mostrar en formato de tabla los datos proporcionados en columnas y adicionalmente el IMC. Se
//debe crear un clase Usuario y crear un objeto de dicha clase a partir de un array de Strings. Se deberá crear en la
//clase un método estático que recibe un Array de Strings y devuelve un objeto de la clase Usuario. Revisar con el
//profesor el patrón Factory Method simple.

public class Usuario {
    String nombre;
    double peso;
    double altura;
        private Object[] args;
    
        public Usuario(String nombre, double peso, double altura){
            this.nombre = nombre;
            this.peso = peso;
            this.altura = altura;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public double getPeso() {
            return peso;
        }
    
        public void setPeso(double peso) {
            this.peso = peso;
        }
    
        public double getAltura() {
            return altura;
        }
    
        public void setAltura(double altura) {
            this.altura = altura;
        }
    
        public double calcularIMC() {
            if (altura <= 0 || peso <= 0) return (Double) null; 
            return peso / (altura * altura);
        }
            
        public static Usuario fromArgs(String[] args){
            if (args.length != 3) { 
            System.err.println("error se requieren solo 3 argumentos: <nombre> <peso> <altura>");
            return null;
        }
    
            String nombre = args[0];

            try {
                double peso = Double.parseDouble(args[1]);
                double altura = Double.parseDouble(args[2]);
                return new Usuario(nombre, peso, altura);
        }

            catch (NumberFormatException e) {
                System.err.println("error, el peso y la alutra deben ser valores numericos");
                return null;
            }
        }
    }

    

