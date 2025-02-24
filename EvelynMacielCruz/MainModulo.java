import java.util.Scanner; // Importamos Scanner

class MainModulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Modulo modulo = new Modulo();
        int opcion;

        do {
            System.out.println("\n--- Menú de Módulo ---");
            System.out.println("1. Realizar módulo");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el primer número: ");
                modulo.setNum(scanner.nextInt());

                System.out.print("Ingrese el segundo número: ");
                modulo.setNum2(scanner.nextInt());

                System.out.println("El módulo es: " + modulo.calcular());
            } else if (opcion != 2) {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 2);

        System.out.println("Saliendo... ¡Hasta luego!");
        scanner.close();
    }
}


