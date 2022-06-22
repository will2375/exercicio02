package exercicos02;

import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu ganho por hora: ");
        double valor = input.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas  no mês: ");
        double hora = input.nextDouble();

        input.close();

        double salario = (valor * hora);

        System.out.println("Seu Salario no mês é: " + salario);
    }

}


