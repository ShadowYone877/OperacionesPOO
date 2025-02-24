import java.util.Scanner; // Importamos Scanner para recibir entrada del usuario

class MainMultiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos Scanner
        Multiplicacion multiplicacion = new Multiplicacion(); // Creamos objeto Multiplicacion
        int opcion; // Variable para la opción del usuario

        do {
            System.out.println("\n--- Menú de Multiplicación ---"); 
            System.out.println("1. Realizar multiplicación");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el primer número: ");
                multiplicacion.setNum(scanner.nextInt());

                System.out.print("Ingrese el segundo número: ");
                multiplicacion.setNum2(scanner.nextInt());

                System.out.println("La multiplicación es: " + multiplicacion.calcular());
            } else if (opcion != 2) {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 2);

        System.out.println("Saliendo... ¡Hasta luego!");
        scanner.close();
    }
}


