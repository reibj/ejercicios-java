import java.util.Scanner;

public class Ej11{
    public static void main(String[] args) {
        /*11. Escribe un programa que valide un inicio de sesión. El programa debe
        solicitar un nombre de usuario (String) y una contraseña (String).
        Implementa los siguientes criterios para la validación:
        - Usuario Válido: El nombre de usuario NO debe ser una cadena vacía
        (ver método .isEmpty() de String) Y debe ser igual a la cadena "Admin"
        O a la cadena "UsuarioPrueba.
        - Contraseña Segura: La contraseña debe tener una longitud de 8 o más
        caracteres (ver .length() de String) Y NO debe ser igual (ver .equals() de
        String) al nombre de usuario.
        El programa debe hacer las comprobaciones anteriores e imprimir:
        - “Inicio de Sesión Exitoso": Si el usuario es válido Y la contraseña es
        segura.
        - "Error: Credenciales Inválidas": Si el usuario es válido, pero la contraseña
        no es segura.
        - "Error: Usuario No Encontrado": Si el usuario no es válido.*/

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inicio de sesión");
        System.out.println("Introduce el usuario:");
        String usuario = teclado.nextLine();
        

        //comporbamos que las cadenas no estén vacías
        if (usuario.equals("Admin") || usuario.equals("UsuarioPrueba")){
            System.out.println("Usuario correcto");
            System.out.println("Introduce la contraseña:");
            String contra = teclado.nextLine();

            if (contra.length()<8 || contra.equals(usuario)){
                System.out.println("Error: Credenciales Inválidas");

            } else {
                System.out.println("Inicio de sesión exitoso");
            }

        } else if (usuario.isEmpty()){
            System.out.println("Error, el campo 'usuario' no puede estar vacío");

        } else {
            System.out.println("Error: Usuario no encontrado");
        }
        

        teclado.close();

    }
}