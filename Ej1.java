import java.util.Scanner;

public class Ej1{
    public static void main(String[] args) {
        /*1. Desarrolla un programa para uso en la caja de una pizzería, y que calcula
        el total de los pedidos, teniendo en cuenta que cada pizza cuesta 9€.
        El programa:
        - Pregunta al usuario cuántas pizzas se quiere facturar
        - Pregunta si el cliente es socio
        - Para calcular el precio total:
        o si el cliente es socio, se aplica un descuento de 3€ sobre el total
        o Si no es socio, no se aplica descuento
        - Se imprime al final “El precio del pedido es XX €”, donde XX es el total
        calculado (en función del número de pizzas y descuento)
         */


        //DEFINO PRECIO PIZZA
        int precio = 9;

        //PIDO CANTIDAD DE PIZZAS Y PREGUNTO SI ES SOCIO
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuantas pizzas desea facturar?");

        int pizzas = teclado.nextInt();

        System.out.println("¿Es usted socio?(True/False)");

        boolean socio = teclado.nextBoolean();

        //CALCULO TOTAL DEL PRECIO DE LAS PIZZAS
        int totalPizzas = precio * pizzas;

        //APLICAMOS DESCUENTOS SI ES NECESARIO Y CALCULAMOS TOTAL FINAL
        if (socio==true){
            totalPizzas = totalPizzas - 3;
            System.out.println("El precio del pedido es " + totalPizzas + " euros");
        } else {
            System.out.println("El precio del pedido es " + totalPizzas + " euros");
        }

        teclado.close();

    }
}