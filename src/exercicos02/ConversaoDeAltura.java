package exercicos02;

import java.util.Scanner;

public class ConversaoDeAltura {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        double altura = input.nextDouble();

        input.close();

        double conversor = (altura * 100);
        System.out.println("Sua altura em centímetros é: " + conversor + " Centimetros");
    }
}
