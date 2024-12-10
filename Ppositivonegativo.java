import java.util.Scanner;

public class Ppositivonegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaPositivos = 0, sumaNegativos = 0, countPositivos = 0, countNegativos = 0;

         System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) { 
                System.out.print("Entrada no válida. Intente nuevamente: ");
                scanner.next();
            }
            numeros[i] = scanner.nextInt();

            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                countPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                countNegativos++;
            }
        }


        double promedioPositivos = countPositivos > 0 ? (double) sumaPositivos / countPositivos : 0;
        double promedioNegativos = countNegativos > 0 ? (double) sumaNegativos / countNegativos : 0;

        System.out.printf("Promedio de positivos: %.2f%n", promedioPositivos);
        System.out.printf("Promedio de negativos: %.2f%n", promedioNegativos);

        scanner.close();
    }
} 