package exercicos02;

import java.util.Scanner;

public class Rendaliquida {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu ganho por hora: ");
        double valor = input.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas  no mês: ");
        double hora = input.nextDouble();

        input.close();

        double salario = (valor * hora);
        System.out.println("Seu Salario no mês é: " + salario + " valor bruto em reais");

        double imposto = (salario * 11 / 100);

        double inss = (salario * 8/ 100);

        System.out.println("Valor pago de inss é: " + inss + " reais");

        double sindicato = (salario * 5 / 100);

        System.out.println("Valor pago ao sindicato é:" + sindicato + " reais");

        double liquido = (salario - (imposto + inss + sindicato));
        System.out.println("O salario liquido é de: " + liquido + " reais");




    }
}
