import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class GastosPedro {

    // Método que calcula el gasto en arriendo basado en el sueldo
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.40; // 40% del sueldo se destina al arriendo
    }

    // Método que calcula el gasto en comida basado en el sueldo
    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15; // 15% del sueldo se destina a la comida
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        // Solicitar al usuario el sueldo mensual de Pedro
        System.out.print("Ingrese el sueldo mensual de Pedro: ");
        double sueldo = scanner.nextDouble();

        // Calcular los gastos
        double gastoArriendo = calcularGastoArriendo(sueldo);
        double gastoComida = calcularGastoComida(sueldo);
        double dineroRestante = sueldo - (gastoArriendo + gastoComida);

        // Crear un formateador para números con punto como separador decimal
        NumberFormat formato = NumberFormat.getNumberInstance(Locale.US);
        formato.setMaximumFractionDigits(2); // Configurar para mostrar dos decimales

        // Mostrar el gasto en arriendo con formato adecuado
        System.out.println("Gasto en arriendo: " + formato.format(gastoArriendo));
        // Mostrar el gasto en comida con formato adecuado
        System.out.println("Gasto en comida: " + formato.format(gastoComida));
        // Mostrar el dinero restante con formato adecuado y en color rojo
        System.out.println("\u001B[31mDinero restante: " + formato.format(dineroRestante) + "\u001B[0m");
    }
}
