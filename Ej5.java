import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        /*
         * 5. Realiza el «juego de la suma» , que consiste en que aparezcan dos
         * números enteros aleatorios (comprendidos entre 1 y 99) que el usuario
         * tiene que sumar. La aplicación debe indicar si el resultado de la operación
         * es correcto o incorrecto.
         */

        Scanner teclado = new Scanner(System.in);

        // introduccion
        System.out.println("Juego de la suma");
        System.out.println("A continuación aparecerán 2 números aleatorios entre 1 y 99, súmalos.");

        // generamos 2 numeros aleatorios, y usamos esta formula para que sean entero,
        // hasta el 99
        int num1 = (int) (Math.random() * 99 + 1);
        int num2 = (int) (Math.random() * 99 + 1);

        System.out.println(num1);
        System.out.println(num2);

        // esperamos respuesta
        System.out.println("Introduce el resultado:");

        int resultado = teclado.nextInt();

        // comparamos si es correcta o no
        if (resultado == (num1 + num2)) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto, el resultado era " + (num1 + num2));
        }

        teclado.close();

    }
}