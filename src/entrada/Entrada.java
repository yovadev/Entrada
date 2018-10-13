package entrada;
import java.util.Scanner;

public class Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba a mensaje a continuación:");
        //introducir datos
        Scanner primeravariable = new Scanner(System.in);
        //mostar en pantalla
        System.out.println("el mensaje escrito es: "+primeravariable.nextLine());
        
    }
    
}
