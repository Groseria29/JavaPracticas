public class FuncionOperacion {

    // Método estático para calcular el valor de la función algebraica
    public static int calcularFuncion(int x, int y) {
        return (x * x) + (2 * x * y) + (y * y);
    }

    public static void main(String[] args) {
        int x = 3; // Ejemplo de valor para x
        int y = 4; // Ejemplo de valor para y

        int resultado = calcularFuncion(x, y);

        System.out.println("El valor de la función f(x, y) = x^2 + 2xy + y^2 es: " + resultado);
    }
}



