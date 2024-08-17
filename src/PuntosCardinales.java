import java.util.Scanner;

// Clase que representa un punto en un plano cartesiano
class PuntosCardinales {
    private double x; // Coordenada x del punto
    private double y; // Coordenada y del punto

    // Constructor para inicializar un punto con coordenadas x e y
    public PuntosCardinales(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método para obtener la coordenada x del punto
    public double getX() {
        return x;
    }

    // Método para obtener la coordenada y del punto
    public double getY() {
        return y;
    }
}

// Clase con métodos para realizar cálculos relacionados con puntos
class Calculadora {
    // Método estático para calcular la distancia entre dos puntos
    public static double calcularDistancia(PuntosCardinales p1, PuntosCardinales p2) {
        double deltaX = p2.getX() - p1.getX(); // Diferencia en x
        double deltaY = p2.getY() - p1.getY(); // Diferencia en y
        // Usar el teorema de Pitágoras para calcular la distancia
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    // Método estático para calcular la pendiente de la recta que une dos puntos
    public static double calcularPendiente(PuntosCardinales p1, PuntosCardinales p2) {
        double deltaX = p2.getX() - p1.getX(); // Diferencia en x
        double deltaY = p2.getY() - p1.getY(); // Diferencia en y
        // Calcular la pendiente (deltaY / deltaX)
        return deltaY / deltaX;
    }
}

// Clase principal que contiene el método main
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario

        // Solicitar las coordenadas del primer punto
        System.out.print("Ingrese la coordenada x1 del primer punto: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y1 del primer punto: ");
        double y1 = scanner.nextDouble();

        // Solicitar las coordenadas del segundo punto
        System.out.print("Ingrese la coordenada x2 del segundo punto: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y2 del segundo punto: ");
        double y2 = scanner.nextDouble();

        // Crear dos objetos PuntosCardinales con las coordenadas ingresadas
        PuntosCardinales p1 = new PuntosCardinales(x1, y1);
        PuntosCardinales p2 = new PuntosCardinales(x2, y2);

        // Calcular la distancia y la pendiente entre los dos puntos
        double distancia = Calculadora.calcularDistancia(p1, p2);
        double pendiente = Calculadora.calcularPendiente(p1, p2);

        // Mostrar los resultados al usuario
        System.out.println("La distancia entre los dos puntos es: " + distancia);
        System.out.println("La pendiente de la recta que une los dos puntos es: " + pendiente);
    }
}

