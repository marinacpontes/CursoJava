public class DesafioAula13 {
    public static void main(String[] args) {
        // Desafio aula 13: tranformar Celsius em Fahrenheit
        double celsius = 30.4; double fahrenheit = (celsius * 1.8 + 32);
        String mensagem = String.format("A temperatura %.3f Celsius é equivalente a %.3f Fahrenheit", celsius, fahrenheit);
        System.out.println(mensagem);
        int fahrenheitInteira = (int) fahrenheit;
        System.out.println("aA temperatura em Fahrenheit inteira é: " + fahrenheitInteira);
    }
}