import java.util.Scanner;

public class Ej2{
    public static void main(String[] args) {
        /*2. Escribe un programa que determine si los asistentes a un evento musical
        tienen acceso preferente. Las condiciones para este tipo de acceso son:
        • Si la edad del participante es < 16 o > 65, se concede acceso preferente
        • Si la edad está comprendida entre 16 y 65 , no se concede acceso
        preferente salvo que se trate de un acompañante de alguien que sí
        tiene derecho a acceso preferente.
         */


        System.out.println("Bienvenido al evento");

        Scanner teclado = new Scanner(System.in);

        //Preguntamos la edad y definimos su valor
        System.out.println("¿Que edad tiene?");
        int edad = teclado.nextInt();


        //si cumple los requisitos, se dejará pasar
        if (edad<16 || edad>65){ //requisito edad
            System.out.println("Tiene usted acceso preferente");
        } else{ //requisito acompañante
            System.out.println("¿Es usted acompañante de alguien cuya edad es menor de 16 o mayor de 65 (true/false)?");
            Boolean acompañante = teclado.nextBoolean();

            if (acompañante == true) {
                System.out.println("Tiene usted acceso preferente");
            } else {
                System.out.println("No tiene acceso preferente");
            }
        }

        teclado.close();

    }
}