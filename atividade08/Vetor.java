import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);
        int valor = -1;

        try {
            int indice = 0;
            while (valor != 0) {
                System.out.print("Digite um valor inteiro (0 para sair): ");
                valor = scanner.nextInt();
                
                if (valor == 0) {
                    vetor[indice] = valor;
                    break; 
                }
                
                vetor[indice] = valor;
                indice++;
            }

            System.out.println("Elementos do vetor:");
            for (int i = 0; i < indice; i++) {
                System.out.println(vetor[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é numérico.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Você tentou inserir mais que 10 valores.");
        } finally {
            scanner.close();
        }
    }
}
