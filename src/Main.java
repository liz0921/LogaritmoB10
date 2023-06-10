import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //Clase para leer el texto
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void menu() throws IOException {
        int opcion=0;
        do {
            System.out.println("------MENÚ-------");
            System.out.println("1 - Coversión");
            System.out.println("2 - Salir");
            System.out.println("-----------------");

             opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                        convertir();
                    break;

                case 2:
                    System.out.println("Saliendo del programa...");

                    break;
            default:
                System.out.println("Por favor seleccione una opción válida");

            }
        } while (opcion != 2);
    }

    public static void convertir() throws IOException {
        try {
            System.out.print("Ingrese el número para calcular el logaritmo ");
            double numero = Double.parseDouble(br.readLine());

            System.out.print("Ingrese la base a la que desea convertir el logaritmo: ");
            int base = Integer.parseInt(br.readLine());

            double logBase10 = Math.log10(numero);
            double logConvert = logBase10 / Math.log10(base);
            System.out.println("El logaritmo en base 10 de " + numero + " es: " + logBase10);
            System.out.println("El logaritmo convertido a base " + base + " es: " + logBase10);

        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un valor numérico válido.");
        } catch (IOException e) {
            System.out.println("Error al leer la entrada del usuario.");
            e.printStackTrace();
        }

    }
}
