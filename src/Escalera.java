public class Escalera {

    // Atributos de la clase
    private double altura; // x
    private double angulo; // α en grados

    // Constructor para inicializar los valores de altura y ángulo
    public Escalera(double altura, double angulo) {
        this.altura = altura;
        this.angulo = angulo;
    }

    // Método para calcular la longitud de la escalera (y)
    public double calcularLongitudEscalera() {
        // Convertir el ángulo a radianes, ya que Math.sin() usa radianes
        double anguloEnRadianes = Math.toRadians(angulo);

        // Calcular y retornar la longitud de la escalera
        return altura / Math.sin(anguloEnRadianes);
    }

    // Método principal para probar la clase Escalera
    public static void main(String[] args) {
        // Crear un objeto de la clase Escalera
        Escalera escalera = new Escalera(10, 30); // Se ingresa el valor
        // Calcular la longitud de la escalera
        double longitudEscalera = escalera.calcularLongitudEscalera();

        // Mostrar la longitud de la escalera
        System.out.println("La longitud de la escalera es: " + longitudEscalera + " metros.");
    }
}

