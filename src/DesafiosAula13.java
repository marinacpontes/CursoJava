import java.util.Scanner;
public class DesafiosAula13 {
    public static void main(String[] args) {
        // 1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo"]
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Digite um número");
        int numeroQ1 = scanner.nextInt();
        if (numeroQ1 > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        // 2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior
        System.out.println("\n2. Digite o primeiro número");
        System.out.println("Digite o segundo número");
        int numero1Q2 = scanner.nextInt(); int numero2Q2 = scanner.nextInt();
        if (numero1Q2 == numero2Q2) {
            System.out.println("Os dois números são iguais");
        } else if (numero1Q2 > numero2Q2) {
            System.out.println("O primeiro número é maior que o segundo");
        } else {
            System.out.println("O segundo número é maior que o primeiro");
        }

        // 3. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada
        int escolha = 0;
        while (escolha != 3) {
            System.out.println("\n3. ---Menu---");
            System.out.println("Digite 1 para calcular a área do quadrado");
            System.out.println("Digite 2 para calcular a área do círculo");
            System.out.println("Digite 3 para sair");
            System.out.println("Escolha uma opção");
            escolha = scanner.nextInt();
            if (escolha == 1) {
                System.out.println("Digite o lado do quadrado");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.println("Digite o raio do círculo");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círuculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado");
            } else {
                System.out.println("Opção inválida. Tente novamente");
            }
        }

        // 4. Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10
        System.out.println("\n4. Digite um número de 1 a 10");
        int numeroQ4 = scanner.nextInt();
        System.out.println("Tabuada do " + numeroQ4 + ":");
        for (int i = 1; i <=10; i++) {
            System.out.println(numeroQ4 + " x " + i + " = " + (numeroQ4 * i));
        }

        // 5. Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente
        System.out.println("\n5. Digite um número");
        int numeroQ5 = scanner.nextInt();
        if (numeroQ5 % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }

        // 6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número
        System.out.println("\n6. Digite um numero");
        int numeroQ6 = scanner.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numeroQ6; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numeroQ6 + " é: " + fatorial);

    }
}
