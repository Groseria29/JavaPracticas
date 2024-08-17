public class OrganizadorDepaseo {
    public static int calcularNumeroDeBuses(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        // Cada estudiante gordo ocupa dos sillas
        int sillasOcupadasPorGordos = estudiantesGordos * 2;
        // Cada estudiante flaco ocupa una silla
        int sillasOcupadasPorFlacos = estudiantesFlacos;

        // Total de sillas ocupadas
        int sillasTotalesOcupadas = sillasOcupadasPorGordos + sillasOcupadasPorFlacos;

        // Calcular el número de buses necesarios
        int numeroDeBuses = (int) Math.ceil((double) sillasTotalesOcupadas / sillasPorBus);

        return numeroDeBuses;
    }

    public static void main(String[] args) {
        int sillasPorBus = 50; // Ejemplo: cada bus tiene 50 sillas
        int estudiantesGordos = 20; // Ejemplo: 20 estudiantes gordos
        int estudiantesFlacos = 30; // Ejemplo: 30 estudiantes flacos

        int busesNecesarios = calcularNumeroDeBuses(sillasPorBus, estudiantesGordos, estudiantesFlacos);

        System.out.println("Número de buses necesarios: " + busesNecesarios);
    }
}
