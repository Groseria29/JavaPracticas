public class Terrenos {

    public static void main(String[] args) {
        // Definir las dimensiones del terreno
        double largo = 5.0;
        double ancho = 12.0;
        double altura = 13.0;

        // Calcular área y perímetro
        double areaRectangulo = calcularAreaRectangulo(ancho, largo - altura);
        double hipotenusa = calcularHipotenusaTriangulo(largo - altura, ancho);
        double areaTriangulo = calcularAreaTriangulo(ancho, largo - altura);
        double areaTotal = areaRectangulo + areaTriangulo;
        double perimetroTotal = calcularPerimetroTerreno(largo, ancho, altura);

        // Mostrar resultados
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Hipotenusa del triángulo: " + hipotenusa);
        System.out.println("Área del triángulo: " + areaTriangulo);
        System.out.println("Área total del terreno: " + areaTotal);
        System.out.println("Perímetro del terreno: " + perimetroTotal);
    }

    // Método para calcular el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Método para calcular la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusaTriangulo(double cateto1, double cateto2) {
        return Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
    }

    // Método para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Método para calcular el perímetro del terreno
    public static double calcularPerimetroTerreno(double lado1, double lado2, double hipotenusa) {
        return lado1 + lado2 + hipotenusa;
    }
}
