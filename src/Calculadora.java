import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        System.out.println("¿Qué operación desea realizar Suma(1) | Resta(2) | Multiplicación (3) | División (4) ?:");

        while(true) {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("suma()");
                    break;
                case 2:
                    System.out.println("resta()");
                    break;
                case 3:
                    System.out.println("eliminar()");
                    break;
                case 4:
                    System.out.println("division()");
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