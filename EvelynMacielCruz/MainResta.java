import java.util.Scanner; // Importamos Scanner para recibir entrada del usuario

// Definimos la clase principal MainResta
class MainResta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner
        Resta resta = new Resta(); // Creamos un objeto de la clase Resta
        int opcion; // Variable para la opción del usuario

        do {
            System.out.println("\n--- Menú de Resta ---"); // Mostramos el menú
            System.out.println("1. Realizar resta"); // Opción para realizar la resta
            System.out.println("2. Salir"); // Opción para salir
            System.out.print("Seleccione una opción: "); // Pedimos al usuario elegir una opción
            opcion = scanner.nextInt(); // Leemos la opción ingresada

            if (opcion == 1) { // Si el usuario elige hacer una resta
                System.out.print("Ingrese el primer número: ");
                resta.setNum(scanner.nextInt()); // Guardamos el primer número

                System.out.print("Ingrese el segundo número: ");
                resta.setNum2(scanner.nextInt()); // Guardamos el segundo número

                System.out.println("La resta es: " + resta.calcular()); // Mostramos el resultado
            } else if (opcion != 2) {
                System.out.println("Opción inválida. Intente de nuevo."); // Mensaje si la opción es incorrecta
            }
        } while (opcion != 2); // Repetimos hasta que el usuario elija salir

        System.out.println("Saliendo... ¡Hasta luego!");
        scanner.close(); // Cerramos el scanner
    }
}

