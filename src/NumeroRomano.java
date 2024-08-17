import java.util.Scanner;

public class NumeroRomano {

    private int numero;

    // Constructor que inicializa el número
    public NumeroRomano(int numero) {
        if (numero < 1 || numero > 99) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 99.");
        }
        this.numero = numero;
    }

    // Método para obtener la cifra de las decenas
    private int obtenerDecenas() {
        return numero / 10;
    }

    // Método para obtener la cifra de las unidades
    private int obtenerUnidades() {
        return numero % 10;
    }

    // Método para convertir un dígito a su equivalente romano
    private String convertirUnidadARomano(int unidad) {
        switch (unidad) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            default: return ""; // Para 0
        }
    }

    // Método para convertir las decenas a su equivalente romano
    private String convertirDecenaARomano(int decena) {
        switch (decena) {
            case 1: return "X";
            case 2: return "XX";
            case 3: return "XXX";
            case 4: return "XL";
            case 5: return "L";
            case 6: return "LX";
            case 7: return "LXX";
            case 8: return "LXXX";
            case 9: return "XC";
            default: return ""; // Para 0
        }
    }

    // Método público para obtener la representación en romano del número
    public String convertirARomano() {
        int decenas = obtenerDecenas();
        int unidades = obtenerUnidades();

        String romanoDecenas = convertirDecenaARomano(decenas);
        String romanoUnidades = convertirUnidadARomano(unidades);

        return romanoDecenas + romanoUnidades;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número entero del usuario
        System.out.print("Ingrese un número entero entre 1 y 99: ");
        int numero = scanner.nextInt();

        try {
            // Crear una instancia de NumeroRomano y convertir el número a romano
            NumeroRomano numeroRomano = new NumeroRomano(numero);
            String resultado = numeroRomano.convertirARomano();
            System.out.println("Número en romano: " + resultado);
        } catch (IllegalArgumentException e) {
            // Mostrar mensaje de error si el número está fuera del rango permitido
            System.out.println("Error: " + e.getMessage());
        }
    }
}

