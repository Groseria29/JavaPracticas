import java.util.Scanner;

public class NumeroEntero {

    // Función para encontrar el mayor de dos números enteros
    public static int encontrarMayor(int num1, int num2) {
        // Comparar los dos números usando una instrucción if
        if (num1 > num2) {
            return num1; // Si num1 es mayor que num2, devolver num1
        } else {
            return num2; // Devolver num2 si no lo es
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer entradas del usuario

        // Pedir al usuario que ingrese el primer número entero
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        // Pedir al usuario que ingrese el segundo número entero
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Usar la función para encontrar el mayor de los dos números
        int mayor = encontrarMayor(numero1, numero2);

        // Mostrar el resultado al usuario
        System.out.println("El mayor de los dos números es: " + mayor);
    }
}


