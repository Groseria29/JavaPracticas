import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SueldoEmpleado {

    private double sueldoActual;

    // Constructor para inicializar el sueldo actual del empleado
    public SueldoEmpleado(double sueldo) {
        this.sueldoActual = sueldo;
    }

    // Método para calcular el incremento basado en el sueldo
    public double calcularIncremento() {
        double incremento;
        if (sueldoActual <= 800000) {
            incremento = sueldoActual * 0.10; // Incremento del 10%
        } else if (sueldoActual <= 1200000) {
            incremento = sueldoActual * 0.08; // Incremento del 8%
        } else {
            incremento = sueldoActual * 0.05; // Incremento del 5%
        }
        return incremento;
    }

    // Método para calcular el nuevo sueldo después del incremento
    public double obtenerNuevoSueldo() {
        return sueldoActual + calcularIncremento();
    }

    // Método para formatear números con comas como separadores de miles
    private String formatearNumero(double numero) {
        NumberFormat formato = NumberFormat.getNumberInstance(Locale.getDefault());
        return formato.format(numero);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el sueldo actual del empleado
        System.out.print("Introduce el sueldo actual del empleado: ");
        double sueldo = scanner.nextDouble();

        // Crear un objeto SueldoEmpleado con el sueldo introducido
        SueldoEmpleado empleado = new SueldoEmpleado(sueldo);

        // Calcular el incremento y el nuevo sueldo
        double incremento = empleado.calcularIncremento();
        double nuevoSueldo = empleado.obtenerNuevoSueldo();

        // Mostrar los resultados con formato de comas
        System.out.println("El incremento en el sueldo es: " + empleado.formatearNumero(incremento));
        System.out.println("El nuevo sueldo del empleado es: " + empleado.formatearNumero(nuevoSueldo));
    }
}
