import java.util.Scanner;

public class Terrenos {

    // Método para calcular el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Método para calcular la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
    }

    // Método para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Método para calcular el perímetro del terreno dado tres lados
    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        double alturaTriangulo = ladoA - ladoC;
        double hipotenusa = calcularHipotenusa(ladoB, alturaTriangulo);
        return ladoA + ladoB + ladoC + hipotenusa;
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las dimensiones de los lados del terreno
        System.out.print("Ingrese el lado A: ");
        double ladoA = scanner.nextDouble();
        System.out.print("Ingrese el lado B: ");
        double ladoB = scanner.nextDouble();
        System.out.print("Ingrese el lado C: ");
        double ladoC = scanner.nextDouble();

        // Calcular el área del rectángulo
        double areaRectangulo = calcularAreaRectangulo(ladoB, ladoC);
        System.out.println("Área del rectángulo: " + areaRectangulo);

        double alturaTriangulo = ladoA - ladoC;
        double areaTriangulo = calcularAreaTriangulo(ladoB, alturaTriangulo);
        System.out.println("Área del triángulo: " + areaTriangulo);

        // Calcular el área total del terreno
        double areaTotal = areaRectangulo + areaTriangulo;
        System.out.println("Área total del terreno: " + areaTotal);

        // Calcular y mostrar el perímetro del terreno
        double perimetro = calcularPerimetroTerreno(ladoA, ladoB, ladoC);
        System.out.println("Perímetro del terreno: " + perimetro);

        scanner.close();
    }
}
