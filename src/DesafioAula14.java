public class DesafioAula14 {
    public static void main(String[] args) {

        // 1. Crie um programa que realize a média de duas notas decimais e exiba o resultado
        double nota1 = 9.5; double nota2 = 9.7; double media = (nota1 + nota2) / 2;
        String mediaInteira = String.format("%.1f", media);
        System.out.println("1. A média é: " + mediaInteira);

        // 2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado
        double d = 8.5;
        int i = (int) d;
        System.out.println("2. Casting de double para int: " + i);

        // 3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem
        char letra = ('J');
        String palavra = "ava";
        String mensagem = String.format("3. Palavra formada: " + letra + palavra);
        System.out.println(mensagem);

        // 4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem
        double precoProduto = 10.5;
        int quantidadeProduto = 5;
        double valorTotal = precoProduto * quantidadeProduto;
        System.out.println("4. O valor total é: R$ " + valorTotal);

        // 5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado
        double valorEmDolares = 100.5; double valorConversao = 4.94; double valorEmReais = valorEmDolares * valorConversao;
        String valorEmReaisDuasCasas = String.format("%.2f", valorEmReais);
        System.out.println("5. O valor em reais é: R$ " + valorEmReaisDuasCasas);

        // 6. Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto
        double precoOriginal = 50.57; double percentualDesconto = 5;
        double valorDoDesconto = (percentualDesconto / 100) * precoOriginal;
        double precoComDesconto = (precoOriginal - valorDoDesconto);
        String valorDoDescontoDuasCasas = String.format("%.2f", valorDoDesconto);
        String precoComDescontoDuasCasas = String.format("%.2f", precoComDesconto);
        System.out.println("6. O preco original do produto é: R$ " + precoOriginal + ". O valor do desconto é: R$ " + valorDoDescontoDuasCasas + " e o preço final com o desconto é: R$ " + precoComDescontoDuasCasas);
    }
}