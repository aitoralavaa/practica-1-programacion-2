package aplicacion;

import mates.Matematicas;

/**
 * La clase Principal es la clase de entrada para la aplicación. Contiene el método main
 * para iniciar la ejecución del programa y mostrar una aproximación del número Pi.
 */
public class Principal {

    /**
     * El método main es el punto de entrada principal para la aplicación.
     * Se encarga de imprimir en la consola una aproximación del número Pi
     * utilizando el método generarNumeroPiIterativo de la clase Matematicas.
     *
     * @param args Los argumentos de línea de comandos. Se espera que el primer argumento
     *             sea un entero que indique el número de pasos para la aproximación de Pi.
     */
    public static void main(String[] args) {
        // Imprime en la consola la aproximación del número Pi
        System.out.println("El número PI es " +
                Matematicas.generarNumeroPiIterativo(Integer.parseInt(args[0])));
    }
}

