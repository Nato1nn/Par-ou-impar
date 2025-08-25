package instrucoes;

import java.util.Scanner;

public class Codigo {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();

        if (n1 > 0) {
            System.out.println("O número é positivo.");
        } else if (n1 < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        if (n1 % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }

        Scanner close;
    }

}
