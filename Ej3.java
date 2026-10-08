import java.util.Scanner;

public class Ej3{
    public static void main(String[] args) {
        /*3. Escribe un programa que determine si un año, introducido por el usuario,
        es bisiesto o no.
        Imprime el mensaje “¿Es el año AAAA bisiesto? : true/false” donde AAAA es
        el año indicado por el usuario.
        Considera que un año es bisiesto si es múltiplo de 4 pero no de 100 , o bien,
        es múltiplo de 400.*/

        Scanner teclado = new Scanner(System.in);

        //pedimos al usuario el año
        System.out.println("Vamos a comprobar si un año es bisiesto");
        System.out.println("Introduce el año");
        int anyo = teclado.nextInt();

        //calculamos si es bisiesto o no
        if (anyo % 4 == 0 && anyo % 100 != 0){
            System.out.println("El año " + anyo + " es bisiesto");
        } else if (anyo % 400 == 0) {
            System.out.println("El año " + anyo + " es bisiesto");
        } else {
            System.out.println("El año " + anyo + " bisiesto");
        }
        teclado.close();

    }
}