public class Persona {

    private String nombre;
    private float peso;
    private float altura;


    public Persona(){
        this.nombre= "desconocido" ;
        this.peso=70;
        this.altura=175;
    }

    public Persona(String nombre, float peso, float altura){
        this.nombre=nombre;
        this.peso=peso;
        this.altura=altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Float calcularIMC() {
        if (altura <= 0 || peso <= 0) return null; 
        return peso / (altura * altura);
}
}