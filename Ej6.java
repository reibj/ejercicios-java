import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        /*
         * 6. Modifica el programa anterior para que, además de los dos números
         * aleatorios, también se proponga la operación que debe realizar el jugador:
         * “suma”, “resta” o “multiplicación”.
         */

        Scanner teclado = new Scanner(System.in);

        // introduccion
        System.out.println("Juego de operaciones");
        System.out.println("A continuación aparecerán 2 números aleatorios entre 1 y 99, opera.");

        // generamos 2 numeros aleatorios, y usamos esta formula para que sean entero,
        // hasta el 99
        int num1 = (int) (Math.random() * 99 + 1);
        int num2 = (int) (Math.random() * 99 + 1);

        /*
         * vamos a declarar una variable operacion para que nos de un numero
         * aleatorio y segun este, corresponderá a una operación u otra
         */

        int operacion = (int) (Math.random() * 3 + 1);

        // condicional de operacion
        if (operacion == 1) {
            System.out.println("Suma");

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
        } else if (operacion == 2){
            System.out.println("Resta");

            System.out.println(num1);
            System.out.println(num2);

            // esperamos respuesta
            System.out.println("Introduce el resultado:");

            int resultado = teclado.nextInt();

            // comparamos si es correcta o no
            if (resultado == (num1 - num2)) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto, el resultado era " + (num1 - num2));
            }
        } else {
            System.out.println("Multiplicación");

            System.out.println(num1);
            System.out.println(num2);

            // esperamos respuesta
            System.out.println("Introduce el resultado:");

            int resultado = teclado.nextInt();

            // comparamos si es correcta o no
            if (resultado == (num1 * num2)) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto, el resultado era " + (num1 * num2));
            }
        }

        /*
         * System.out.println(num1);
         * System.out.println(num2);
         * 
         * // esperamos respuesta
         * System.out.println("Introduce el resultado:");
         * 
         * int resultado = teclado.nextInt();
         * 
         * // comparamos si es correcta o no
         * if (resultado == (num1 + num2)) {
         * System.out.println("¡Correcto!");
         * } else {
         * System.out.println("Incorrecto, el resultado era " + (num1 + num2));
         * }
         */

        teclado.close();

    }
}