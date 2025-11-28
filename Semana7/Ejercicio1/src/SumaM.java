
public class SumaM {

    private Integer numero1;
    private Integer numero2;
    private Integer resultado;

    public void setNumeros(int n1, int n2) {
        this.numero1 = n1;
        this.numero2 = n2;
        this.resultado = null;
    }

    public boolean hayNumeros() {
        return numero1 != null && numero2 != null;
    }

    public void calcularSuma() {
        if (!hayNumeros()) {
            throw new IllegalStateException("No hay numeros para sumar");
        }
        this.resultado = numero1 + numero2;
    }

    public boolean hayResultado() {
        return resultado != null;
    }

    public int getResultado() {
        if (!hayResultado()) {
            throw new IllegalStateException("No se ha calculado la suma todavia");
        }
        return resultado;
    }
}
