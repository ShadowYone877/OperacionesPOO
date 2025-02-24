import java.util.Scanner; // Importamos Scanner para leer datos del usuario

// Clase principal donde se ejecuta el programa
class MainSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner
        Suma suma = new Suma(); // Creamos un objeto de la clase Suma
        int opcion; // Variable para almacenar la opción del usuario

        // Bucle do-while para mantener el menú activo hasta que el usuario decida salir
        do {
            // Mostramos el menú de opciones
            System.out.println("\n--- Menú de Suma ---");
            System.out.println("1. Realizar suma");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt(); // Leemos la opción elegida

            if (opcion == 1) { // Si el usuario elige hacer una suma
                System.out.print("Ingrese el primer número: ");
                suma.setNum(scanner.nextInt()); // Asignamos el primer número

                System.out.print("Ingrese el segundo número: ");
                suma.setNum2(scanner.nextInt()); // Asignamos el segundo número

                // Mostramos el resultado de la suma
                System.out.println("La suma es: " + suma.calcular());
            } else if (opcion != 2) { // Si la opción no es válida
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 2); // El bucle continúa hasta que el usuario elija salir

        System.out.println("Saliendo... ¡Hasta luego!");
        scanner.close(); // Cerramos el scanner
    }
}