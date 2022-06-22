package exercicos02;

import java.util.Scanner;

public class numeroInt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        input.close();

        int anterior = (numero - 1);
        System.out.println("O numero anterior a esse é: " + anterior);

        int sucessor  = (numero + 1);
        System.out.println("O numero sucessor a esse é: "+ sucessor);

    }

}
