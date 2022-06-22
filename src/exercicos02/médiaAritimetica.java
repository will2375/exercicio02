package exercicos02;

import java.util.Scanner;

public class médiaAritimetica {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua nota1: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite sua nota2: ");
        double nota2 = input.nextDouble();

        System.out.print("Digite sua nota3: ");
        double nota3 = input.nextDouble();

        System.out.print("Digite sua nota4: ");
        double nota4 = input.nextDouble();

        input.close();

        double notaMédia = ((nota1 + nota2 + nota3 + nota4) / 4);

        System.out.println("Sua Média das Notas é: " + notaMédia );
    }
}
