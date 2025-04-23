import java.util.Scanner;

public class RegistroVisitante_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        byte edad = 0;
        short numeroApartamento;
        long numeroIdentificacion;
        int tiempoPermitido;
        float temperaturaCorporal;
        double peso;
        char genero;
        boolean esPrimeraVisita;

        int totalVisitas = 0;
        int tiempoTotal = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.println("Día " + i + ":");

            System.out.print("Ingrese el nombre del visitante: ");
            nombre = scanner.nextLine();

            System.out.print("Ingrese la edad del visitante: ");
            edad = Byte.parseByte(scanner.nextLine());

            System.out.print("Ingrese el número de apartamento visitado: ");
            numeroApartamento = Short.parseShort(scanner.nextLine());

            System.out.print("Ingrese el número de identificación del visitante: ");
            numeroIdentificacion = Long.parseLong(scanner.nextLine());

            System.out.print("Ingrese la duración de la visita en horas: ");
            tiempoPermitido = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese la temperatura corporal del visitante: ");
            temperaturaCorporal = Float.parseFloat(scanner.nextLine());

            System.out.print("Ingrese el peso del visitante en kilogramos: ");
            peso = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingrese el género del visitante (M/F): ");
            genero = scanner.nextLine().charAt(0);

            System.out.print("¿Es la primera visita? (true/false): ");
            esPrimeraVisita = Boolean.parseBoolean(scanner.nextLine());

            totalVisitas++;
            tiempoTotal += tiempoPermitido;
            System.out.println();
        }

        double tiempoPromedio = (double) tiempoTotal / totalVisitas;
        String estadoEdad = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        System.out.println("Estadísticas de visitas:");
        System.out.println("Total de visitas realizadas: " + totalVisitas);
        System.out.println("Tiempo promedio de estadía: " + tiempoPromedio + " horas");
        System.out.println("Estado del visitante: " + estadoEdad);

        scanner.close();
    }
}