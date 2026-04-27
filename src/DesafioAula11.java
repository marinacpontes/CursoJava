import java.util.Random;
import java.util.Scanner;
public class DesafioAula11 {
    public static void main(String[] args) {
        // Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número de 0 a 100");
            numeroDigitado = leitura.nextInt(); tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número gerado é maior que o número digitado");
            } else {
                System.out.println("O número gerado é menor que o número digitado");
            }
            if (tentativas == 5 && numeroDigitado != numeroGerado) {
                System.out.println("Você não conseguiu acertar o número em 5 tentativas");
            }
        }
    }
}
