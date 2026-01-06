import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingresa un numero:");
            numero = sc.nextInt();
            System.out.println("Ingresaste " + numero);
        } while (numero != 0);
        System.out.println("La suma total es " + numero);
    }
}