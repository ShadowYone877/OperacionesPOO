// Importación de la clase Scanner para leer datos del teclado

import java.util.Scanner;

//Nombre de la clase (UpperCamelCase)
public class MainResta {

    // Metodo principal del programa
    public static void main(String[] args) {

        // Creación de un objeto Scanner 
        Scanner op = new Scanner(System.in);

        // Creacion de un objeto del constructor Resta
        Resta r1 = new Resta();

        // Variable para almacenar la opcion del usuario
        int opcion;

        // Ciclo para repetir el menu hasta que el usuario elija salir
        do {

            // Menu de opciones
            System.out.println("\n0: Salir\n1: Realizar Resta");
            // Ingreso de la opcion del usuario al sistema
            System.out.print("Ingresa el numero correspondiente a la opcion deseada: ");
            // Almacenamiento en la variable opcion
            opcion = op.nextInt();

            // Validacion de la opcion del usuario
            if (opcion == 1) {

                // Pedir el primer valor al usuario 
                System.out.print("\nIngresa el primer valor: ");
                // Almacenamiento del primer valor en la variable x del objeto Resta
                r1.setX(op.nextInt());

                // Pedir el segundo valor al usuario
                System.out.print("\nIngresa el segundo valor: ");
                // Almacenamiento del segundo valor en la variable y del objeto Resta
                r1.setY(op.nextInt());

                // Llama al metodo Restar para obtener el resultado y lo imprime
                System.out.println("\n" + r1.getX() + " - " + r1.getY() + " = " + r1.getRestar() + "\n");
            }

            // Validacion de la opcion del usuario para salir o continuar con el ciclo
        } while (opcion != 0);
    }
}
