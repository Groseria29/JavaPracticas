import java.util.Scanner;

public class AreaCircular {

    // Clase que encapsula las funciones de cálculo
    static class CalculadoraArea {
        // Función que calcula el área de un círculo
        public double calcularAreaCirculo(double radio) {
            return Math.PI * Math.pow(radio, 2);
        }

        // Función que calcula el área de la corona circular
        public double calcularAreaCorona(double radioPequeno, double radioGrande) {
            return calcularAreaCirculo(radioGrande) - calcularAreaCirculo(radioPequeno);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraArea calculadora = new CalculadoraArea();

        // Leer los radios
        System.out.print("Ingrese el radio pequeño (r): ");
        double radioPequeno = scanner.nextDouble();

        System.out.print("Ingrese el radio grande (R): ");
        double radioGrande = scanner.nextDouble();

        // Calcular el área de la corona circular
        double areaCorona = calculadora.calcularAreaCorona(radioPequeno, radioGrande);

        // Formatear el resultado con separadores de miles y dos decimales
        String areaFormateada = String.format("%,.2f", areaCorona);

        // Mostrar el resultado
        System.out.println("El área de la corona circular es: " + areaFormateada);
    }
}
