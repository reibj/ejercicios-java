import java.util.Scanner;

public class Ej8{
    public static void main(String[] args) {
        /*8. Crea una aplicación que solicite al usuario cuántos grados tiene un ángulo
        y muestre el equivalente en radianes.
        - Si el ángulo introducido por el usuario no se encuentra en el rango de 0°
        a 360°, hay que transformarlo a dicho rango. Utiliza el operador módulo
        para convertir un ángulo (> 360) a su equivalente en el rango
        comprendido de 0° a 360°
        - Para convertir de grados a radianes ten en cuenta esta relación:
        radianes = grados * PI/180*/

        Scanner teclado = new Scanner(System.in);

        double PI = 3.1416;

        //pedimos al usuarios que introduzca los valores de las variables declaradas
        System.out.println("Vamos a transformar grados a radianes");
        System.out.println("Introduce los grados");
        Double grados = teclado.nextDouble();

        //comprobamos que el valor introducido este ntre 0-360
        if (grados>360){
            Double gradosTransformados = grados%360; // si grados es mayor, usamos el modulo
            System.out.println("El valor introducido equivale a " + gradosTransformados + " grados");

            Double radianes = gradosTransformados * PI/180; //transformamos a radianes
            System.out.println(gradosTransformados + " grados equivalen a " + radianes + " radianes");

        } else if (grados<0){
            Double gradosTransfromados =(360+grados); // si es menor que 0, restamos
            System.out.println("El valor introducido equivale a " + gradosTransfromados + " grados"); //sumamos ya que queremos restar los grados, y -- lo sumara, asique usamos 360 +(-grados) para restar
            
            Double radianes = gradosTransfromados * PI/180; //transformamos a radianes
            System.out.println(gradosTransfromados + " grados equivalen a " + radianes + " radianes");

        } else{
            Double radianes = grados * PI/180; //transformamos a radianes
            System.out.println(grados + " grados equivalen a " + radianes + " radianes");
        }
            

        
        teclado.close();

    }
}