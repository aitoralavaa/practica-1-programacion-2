package mates;
import java.util.Random;

public class Matematicas {
    /**
     * Genera una aproximación al número Pi mediante el método de
     * Montecarlo. El parámetro `pasos` indica el número de puntos
     * generado.
     */
    public static double generarNumeroPiIterativo(long pasos) {
        Random rand = new Random();
        long puntosDentroCirculo = 0;

        for (long i = 0; i < pasos; i++) {
            double x = rand.nextDouble(); // Genera un punto aleatorio en el eje x
            double y = rand.nextDouble(); // Genera un punto aleatorio en el eje y

            // Calcula la distancia desde el origen (0,0)
            double distancia = Math.sqrt(x * x + y * y);

            // Comprueba si el punto está dentro del círculo (radio=1)
            if (distancia <= 1) {
                puntosDentroCirculo++;
            }
        }

        // La relación entre puntos dentro del círculo y puntos totales se relaciona con Pi/4
        return 4.0 * puntosDentroCirculo / pasos;
    }
}

