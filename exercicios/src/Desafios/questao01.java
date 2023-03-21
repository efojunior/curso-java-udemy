import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // converte para Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " graus Fahrenheit equivalem a " + celsius + " graus Celsius.");
    }
}