import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu peso em kg: ");
        double peso = entrada.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f.", imc);
    }

}
