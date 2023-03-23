import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int opcion = 0;
        int numero1 = 0;
        int numero2 = 0;

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        Scanner scannerString = new Scanner(System.in);
        System.out.println("¿Qué operación desea realizar Suma(1) | Resta(2) | Multiplicación (3) | División (4) ?:");

        while(true) {
            mostrarMenu();
            opcion = scanner.nextInt();

            System.out.println(" Digite el primer número");
            numero1 = scanner1.nextInt();
            System.out.println(" Digite el segundo número");
            numero2 = scanner2.nextInt();

            switch (opcion) {

                case 1:

                    int suma = new Suma().operacion(numero1, numero2);
                    System.out.println("Suma: " + suma);
                    break;
                case 2:
                    int resta = new Resta().operacion(numero1, numero2, 1);
                    System.out.println("Resta: " + resta);
                    break;
                case 3:
                    int mult = new Multiplicacion().operacion(numero1, numero2);
                    System.out.println("Multiplicación: " + mult);
                    break;
                case 4:
                    int division = new Division().operacion(numero1, numero2);
                    System.out.println("División: " + division);
                    break;
                default:
                    break;
            }

            String salir = "";

            System.out.println("Desea Continuar (S/N):");
            salir = scannerString.nextLine();
            if (salir.equalsIgnoreCase("N")) {
                System.exit(0);
            }
        }

    }


    public static void mostrarMenu() {
        System.out.println("**************************************************************");
        System.out.println("Menu");
        System.out.println("**************************************************************");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicación");
        System.out.println("4) División");
        System.out.println("**************************************************************");
    }
}