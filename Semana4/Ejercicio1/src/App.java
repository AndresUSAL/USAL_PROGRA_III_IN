//1. Debes crear un proyecto simple en Java que reciba como argumentos 2 argumentos que deben de ser numéricos. El
//mostrará por pantalla la suma de ambos. En caso de no introducir el número correcto de parámetros o de ser
//incorrectos se indicará al usuario con un mensaje de error informativo. Debes realizar esto empleando el IDE y por
//otro lado, de forma manual con el binario java en la CLI.

public class App {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Error, se deben introducir exactamente 2 argumentos numéricos");
            return;
        }
                        
        try{
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            double suma = num1 + num2;

            System.out.println("La suma de " + num1 + " y " + num2 + "es" + suma);
        }
}
}
