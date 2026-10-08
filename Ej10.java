import java.util.Scanner;

public class Ej10{
    public static void main(String[] args) {
        /*10. Escribe un programa que evalúe si una persona es elegible para un
        préstamo, basándose en dos variables de entrada:
        - el Salario Anual (un número real) y
        - la Antigüedad Laboral en años (un número entero).
        Y en las siguientes reglas:
        4
        - Elegible: Si el Salario Anual es mayor o igual a 30.000 euros Y tiene una
        Antigüedad Laboral de 5 años o más.
        - Revisión Especial: Si el Salario Anual es menor a 30.000 euros pero la
        Antigüedad Laboral es de 10 años o más.
        - No Elegible: En cualquier otro caso.
        El programa debe imprimir, dependiendo de qué reglas de las anteriores
        se cumplan: "Préstamo Aprobado", "Revisión Especial Requerida" o
        "Préstamo Denegado".*/

        Scanner teclado = new Scanner(System.in);

        //pedimos los valores de las variables declaradas
        System.out.println("Préstamo");
        System.out.println("Introduce tu Salario anual");
        double salario = teclado.nextDouble();
        System.out.println("Introduce la antigüedad laboral");
        double antiguedad = teclado.nextDouble();

        //comprobamos que los datos sean correctos (numeros reales)
        if (salario<=0 || antiguedad<=0){
            System.out.println("Dato/s no válidos");
        } else if (salario>=30000 && antiguedad>=5){
            System.out.println("Prestamo aprobado");
        } else if (salario<30000 && antiguedad>=10){
            System.out.println("Revisión especial requerida");
        } else{
            System.out.println("Lo sentimos, prestamo denegado");
        }

        teclado.close();

    }
}