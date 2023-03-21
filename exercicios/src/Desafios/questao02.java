import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double tempCelsius = entrada.nextDouble();

        double tempFahrenheit = (tempCelsius * 9/5) + 32;

        System.out.printf("%.1f Celsius equivale a %.1f Fahrenheit.", tempCelsius, tempFahrenheit);
    }

}
