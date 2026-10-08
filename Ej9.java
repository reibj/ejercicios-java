import java.util.Scanner;

public class Ej9{
    public static void main(String[] args) {
        /*9. Escribe un programa que solicite al usuario las longitudes de los tres lados
        de un triángulo (a, b, c), y que determine qué tipo de triángulo es:
        - Equilátero: si los tres lados son iguales.
        - Isósceles: si exactamente dos lados son iguales
        - Escaleno: si ningún lado es igual.
        El programa debe validar que el valor de todas las longitudes es positivo,
        en caso contrario, finaliza con un mensaje de error. */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Vamos a determinar el tipo de triángulo");

        //pedimos valor y comprobamos que sean correctos
        System.out.println("Introduce el valor del primer lado");
        double a = teclado.nextDouble(); //double en minuscula pq Double guarda el valor como objeto, y al comparar, no compara si tienen el mismo valor, si no, si so exctamenteel mismo objeto
        System.out.println("Introduce el valor del segundo lado");
        double b = teclado.nextDouble();
        System.out.println("Introduce el valor del tercer lado");
        double c = teclado.nextDouble();

        if (a<=0 || b<=0 || c<=0) {
            System.out.println("Error. Has introducido un valor no válido");

        } else if (a==b && b==c){
            System.out.println("Tu triángulo es equilatero");

        } else if (a==b || b==c || a==c){
            System.out.println("Tu triángulo es isósceles");
        }
        else {
            System.out.println("Tu triángulo es escaleno");
        }

        
        teclado.close();

    }
}