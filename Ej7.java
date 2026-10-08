import java.util.Scanner;

public class Ej7{
    public static void main(String[] args) {
        /*7. En una granja se compra diariamente una cantidad (comidaDiaria) de
        comida para los animales. El número de animales que alimentar (todos de
        la misma especie) es numAnimales, y sabemos que cada animal come
        una media de kilosPorAnimal. Diseña un programa que solicite al usuario
        los valores anteriores y determine si disponemos de alimento suficiente
        para cada animal. En caso negativo, ha de calcular cuál es la ración que
        corresponde a cada uno de los animales.
        Nota: Evitar que la aplicación realice divisiones por cero.*/

        Scanner teclado = new Scanner(System.in);

        //pedimos al usuarios que introduzca los valores de las variables declaradas
        System.out.println("Introduce la cantidad de comida diaria necesaria para los animales");
        int comidaDiaria = teclado.nextInt();
        System.out.println("Introduce el número de animales");
        int numAnimales = teclado.nextInt();
        System.out.println("Introduce la media de kilos consumidos por animal");
        int kilosPorAnimal = teclado.nextInt();

        //Con los valores dados, comparamos si hay comida suficiente
        if (numAnimales*kilosPorAnimal<=comidaDiaria) { // calculamos cuanto sobrará
            System.out.println("Hay suficiente comida, te sobrará/n " + (comidaDiaria-(numAnimales*kilosPorAnimal)) + " kilo/s");
        } else { //calculamos cuánto nos falta
            System.out.println("No hay suficiente comida, necesitas " + ((numAnimales*kilosPorAnimal)-comidaDiaria) + " kilos más");
        }

        
        teclado.close();

    }
}