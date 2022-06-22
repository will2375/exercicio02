package exercicos02;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite aqui a temperatura em Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        input.close();

        double celsisus = ((fahrenheit - 32) / 1.8 );
        System.out.println("A temperatura em Celcius é: " + celsisus + "°C");

    }
}
