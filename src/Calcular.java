import java.util.Scanner;

public class Calcular {

    // Método que realiza una operación aritmética en función del operador
    public static double realizaOperacion(int num1, int num2, String operador) {
        switch (operador) {
            case "+":
                return num1 + num2; // Realiza la suma
            case "-":
                return num1 - num2; // Realiza la resta
            case "*":
                return num1 * num2; // Realiza la multiplicación
            case "/":
                if (num2 != 0) {
                    return (double) num1 / num2; // Realiza la división, con verificación de división por cero
                } else {
                    throw new ArithmeticException("No se puede dividir por cero."); // Mensaje de error para división por cero
                }
            case "%":
                return num1 % num2; // Realiza el cálculo del módulo
            case "**":
                return Math.pow(num1, num2); // Realiza la potencia
            default:
                throw new IllegalArgumentException("Operador no válido."); // Mensaje de error para operador no reconocido
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el primer número entero
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        // Solicitar al usuario el operador aritmético
        System.out.print("Ingrese el operador (+, -, *, /, %, **): ");
        String operador = scanner.next();

        // Solicitar al usuario el segundo número entero
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        try {
            // Calcular el resultado y mostrarlo
            double resultado = realizaOperacion(numero1, numero2, operador);
            System.out.println("El resultado de la operación es: " + resultado);
        } catch (ArithmeticException | IllegalArgumentException e) {
            // Mostrar mensaje de error si ocurre una excepción
            System.out.println("Error: " + e.getMessage());
        }
    }
}
