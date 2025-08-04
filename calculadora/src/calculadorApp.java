import java.util.Locale;
import java.util.Scanner;

public class calculadorApp {
    public static Double calculo(double valorUm, double valorDois, string op){
        return switch (op) {
            case "+" -> valorUm + valorDois;

            case "-" -> valorUm - valorDois;

            case "/" -> {
                if (valorDois == 0) {
                    System.out.println("Erro: Não é possível dividir por zero.");
                    yield 0.0;
                }
                yield valorUm / valorDois;
            }
            case "*" -> valorUm * valorDois;
            default -> {
            System.out.println("Operação Inválida.");
                yield 0.0;
            }
        };
    }

    public static boolean novaOperacao() {
        var sc = new Scanner(System.in);
        System.out.println("Deseja realizar outra operação? [Sim ou Não]");
        var resposta = sc.nextLine().toUpperCase(Locale.ROOT);
        return !resposta.equals(NÃO) && !resposta.equals(NAO);
    }
}
