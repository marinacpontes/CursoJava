public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pensa assistir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) /* "||" quer dizer "ou" e "&&" quer dizer "e" */ {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

        int diaEstreia = 3;
        String nomeDia;

        switch (diaEstreia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        } System.out.println("A estreia vai ser no dia " + diaEstreia + " que é " + nomeDia);

        String acesso;
        switch (tipoPlano) {
            case "plus":
                acesso = "você tem acesso a esse filme";
                break;
            case "normal":
                acesso = "você não tem acesso a esse filme";
                break;
            default:
                acesso = "você não tem acesso a esse filme";
                break;
        }
        System.out.println("Você está no plano " + tipoPlano + ", então " + acesso);
    }
}