package paquete1;

class Clase2{

public int C2_atr_pub;
int C2_atr_nad;
private int C2_atr_priv;
protected int C2_atr_proct;

public void C2_metodo_pub(){
    System.out.println("C2 METODO PUBLIC");
}

void C2_metodo_nad(){
    System.out.println("C2 METODO NADA");
}

private void C2_metodo_priv(){
    System.out.println("C2 METODO PRIVATE");
}

protected void C2_metodo_proct(){
    System.out.println("C2 METODO PROTECTED");
}


}