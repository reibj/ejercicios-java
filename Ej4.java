import java.util.Scanner;

public class Ej4{
    public static void main(String[] args) {
        /*4. Escribe una aplicación que solicite por consola dos números reales que
        corresponden a la base y la altura de un triángulo. Deberá mostrarse su
        área, comprobando que los números introducidos por el usuario no son
        negativos ni igual a cero*/

        Scanner teclado = new Scanner(System.in);

        //pedimos el valor de la bas ey la altura
        System.out.println("Vamos a calcular el area de un triangulo");
        System.out.println("Introduce la base (debe ser un numero real)");
        int base = teclado.nextInt();
        System.out.println("Introduce la altura (debe ser un numero real)");
        int altura = teclado.nextInt();

        //comprobamos que son numeros reales
        if (base<=0){
            System.out.println("Valor de la base no válido");
        }
        else if (altura<=0){
            System.out.println("Valor de la altura no válido");
        } else{
        //calculamos el area
        int area = (base*altura)/2;
        System.out.println("El resultado es " + area);
        }

        teclado.close();

    }
}