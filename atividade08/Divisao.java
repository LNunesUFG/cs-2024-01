import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            double resultado = dividir(numero1, numero2);
            
            System.out.println("Resultado da divisão: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é numérico.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } finally {
            scanner.close();
        }
    }

    public static double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return numero1 / numero2;
    }
}
