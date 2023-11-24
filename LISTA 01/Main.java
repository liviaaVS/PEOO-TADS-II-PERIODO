import java.io.IOException;
import java.util.Scanner;

/**
 * Este programa calcula la distancia euclidiana entre dos puntos en un plano 2D.
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leia = new Scanner(System.in);

        double x1 = leia.nextDouble();
        double y1 = leia.nextDouble();
        
        double x2 = leia.nextDouble();
        double y2 = leia.nextDouble();

        double result = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println(result);
    }
}
