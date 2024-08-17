import java.util.Scanner;

// Clase que representa el cálculo de salones y pisos necesarios en un edificio universitario
class EdificioUniversidad {

    // Método estático para calcular el número de salones necesarios
    public static int calcularNumeroDeSalones(int numeroEstudiantes, int capacidadSalon) {
        // Calcular el número de salones necesarios, usando Math.ceil para redondear hacia arriba
        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }

    // Método estático para calcular el número de pisos necesarios
    public static int calcularNumeroDePisos(int numeroSalones, int salonesPorPiso) {
        // Calcular el número de pisos necesarios, usando Math.ceil para redondear hacia arriba
        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    }

    // Método principal que contiene la lógica del programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario

        //Se solicita al usuario el número de estudiantes en la universidad
        System.out.print("Ingrese el número de estudiantes en la universidad: ");
        int numeroEstudiantes = scanner.nextInt();

        // Se solicita al usuario la capacidad de un salón
        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();

        // Se solicita al usuario el número de salones por piso
        System.out.print("Ingrese el número de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();

        // Calcular el número de salones necesarios
        int numeroSalones = calcularNumeroDeSalones(numeroEstudiantes, capacidadSalon);
        // Calcular el número de pisos necesarios
        int numeroPisos = calcularNumeroDePisos(numeroSalones, salonesPorPiso);

        // Mostrar el resultado al usuario
        System.out.println("El número de salones necesarios es: " + numeroSalones);
        System.out.println("El número de pisos necesarios es: " + numeroPisos);
    }
}
