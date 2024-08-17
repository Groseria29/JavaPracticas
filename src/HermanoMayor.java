import java.util.Scanner;

class Hermano {
    private String nombre;
    private int edad;

    // Constructor para inicializar el nombre y la edad del hermano
    public Hermano(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre del hermano
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la edad del hermano
    public int getEdad() {
        return edad;
    }

    // Método estático para obtener el nombre del hermano mayor a partir de tres hermanos
    public static Hermano obtenerHermanoMayor(Hermano h1, Hermano h2, Hermano h3) {
        if (h1.getEdad() >= h2.getEdad() && h1.getEdad() >= h3.getEdad()) {
            return h1;
        } else if (h2.getEdad() >= h1.getEdad() && h2.getEdad() >= h3.getEdad()) {
            return h2;
        } else {
            return h3;
        }
    }
}

public class HermanoMayor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la información de los tres hermanos
        System.out.print("Ingrese el nombre del primer hermano: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingrese la edad del primer hermano: ");
        int edad1 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el nombre del segundo hermano: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingrese la edad del segundo hermano: ");
        int edad2 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el nombre del tercer hermano: ");
        String nombre3 = scanner.nextLine();
        System.out.print("Ingrese la edad del tercer hermano: ");
        int edad3 = scanner.nextInt();

        // Crear los objetos Hermano
        Hermano h1 = new Hermano(nombre1, edad1);
        Hermano h2 = new Hermano(nombre2, edad2);
        Hermano h3 = new Hermano(nombre3, edad3);

        // Determinar el hermano mayor
        Hermano hermanoMayor = Hermano.obtenerHermanoMayor(h1, h2, h3);

        // Mostrar el nombre del hermano mayor
        System.out.println("El hermano mayor es: " + hermanoMayor.getNombre());
    }
}