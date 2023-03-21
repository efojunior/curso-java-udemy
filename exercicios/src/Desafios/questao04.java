import java.util.Scanner;

public class QuadradoCubo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = entrada.nextDouble();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        System.out.printf("O número %.2f elevado ao quadrado é %.2f e elevado ao cubo é %.2f.", numero, quadrado, cubo);
    }

}
