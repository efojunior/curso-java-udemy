import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double a = 1, b = 12, c = -13;

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.printf("O valor do delta é %.2f", delta);
    }

}
