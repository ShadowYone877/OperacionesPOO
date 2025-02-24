// Importamos la clase Scanner para poder recibir datos del usuario

import java.util.Scanner;

// Definimos la clase principal Main
class MainDPOO {

    // Método principal donde inicia la ejecución del programa
    public static void main(String[] args) {
        // Creamos un objeto Scanner para recibir la entrada del usuario
        Scanner opc = new Scanner(System.in);

        // Creamos un objeto de la clase DivisionPOO
        Division s1 = new Division();
        int opcion; // Variable para almacenar la opción del usuario

        // Iniciamos un bucle do-while para mostrar el menú hasta que el usuario decida salir
        do {
            // Mostramos las opciones al usuario
            System.out.println("1. Dividir dos números");
            System.out.println("2. Salir");
            System.out.println("Elija una opción:");
            opcion = opc.nextInt(); // Leemos la opción ingresada por el usuario

            // Utilizamos un switch para manejar las opciones del menú
            switch (opcion) {
                case 1:
                    // Solicitamos al usuario que ingrese un número
                    System.out.println("Ingresa un número:");
                    // Asignamos el número ingresado al atributo num de s1
                    s1.setNum(opc.nextInt());

                    // Solicitamos al usuario que ingrese otro número
                    System.out.println("Ingresa otro número:");
                    // Asignamos el número ingresado al atributo num2 de s1
                    s1.setNum2(opc.nextInt());

                    // Mostramos el resultado de la divisin utilizando el método calcularDivision()
                    System.out.println("La división de los números es: " + s1.calcularDivision());

                    // Falta un "break" aquí para evitar que también se ejecute la opción 2
                    break;

                case 2:
                    // Mensaje de despedida y salida del programa
                    System.out.println("Saliendo del programa...Hasta luego!");
                    break;

                default:
                    // Mensaje de error si el usuario ingresa una opción no válida
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 2); // El bucle se repite hasta que el usuario elija salir
    }
}