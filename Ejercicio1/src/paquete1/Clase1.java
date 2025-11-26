package paquete1;

public class Clase1 {

    public int atr_pub;
    int atr_nad;
    private int atr_priv;
    protected int atr_proct;

    public void metodo_pub(){
        System.out.println("METODO PUBLIC");
    }

    void metodo_nad(){
        System.out.println("METODO NADA");
    }    

    private void metodo_priv(){
        System.out.println("METODO PRIVATE");
    }
    
    protected void metodo_proct(){
        System.out.println("METODO PROTECTED");
    }

    public void atr_pub() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atr_pub'");
    }   

}
