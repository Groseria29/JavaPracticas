import java.util.Scanner;

public class Calendario {

    // Función que recibe el nombre de un día y retorna el nombre del día siguiente
    public static String obtenerDiaSiguiente(String diaActual) {
        switch (diaActual.toLowerCase()) {
            case "lunes":
                return "martes";
            case "martes":
                return "miércoles";
            case "miércoles":
                return "jueves";
            case "jueves":
                return "viernes";
            case "viernes":
                return "sábado";
            case "sábado":
                return "domingo";
            case "domingo":
                return "lunes";
            default:
                throw new IllegalArgumentException("Nombre de día inválido. Usa uno de los siguientes: lunes, martes, miércoles, jueves, viernes, sábado, domingo.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el nombre del día de la semana
        System.out.print("Introduce el nombre del día de la semana: ");
        String dia = scanner.nextLine();

        try {
            // Obtener el nombre del día siguiente y mostrarlo
            String siguienteDia = obtenerDiaSiguiente(dia);
            System.out.println("El día siguiente es: " + siguienteDia);
        } catch (IllegalArgumentException e) {
            // Mostrar mensaje de error si el día ingresado no es válido
            System.out.println("Error: " + e.getMessage());
        }
    }
}
