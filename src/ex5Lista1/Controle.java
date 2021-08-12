package ex5Lista1;

import java.util.Scanner;

public class Controle {
    Scanner scanner = new Scanner(System.in);

    public static String leString(String palavraInserida){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        palavraInserida = scanner.nextLine();
    }

    public static int leInteiro (int numeroInserido){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma número");
        numeroInserido = scanner.nextInt();

    }
}
