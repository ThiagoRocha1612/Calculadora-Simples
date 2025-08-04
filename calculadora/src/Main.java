import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       var scanner = new Scanner(System.in);
       double valorUm;
       double valorDois;
       String op;
       boolean continuar;

       try{
           do{

               System.out.println("Digite o primeiro valor:");
               valorUm = scanner.nextDouble();

               System.out.println("Escolha a operação [ + , - , / , * ]");
               op = scanner.next();

               System.out.println("digite o segundo valor:");
               valorDois = scanner.nextDouble();

               System.out.println("Resultado:" + calculadorApp.calculo(valorUm, valorDois, String op));

           } while(continuar);
       } catch (InputMismatchException ex){
           System.out.println("Erro: os valores devem ser numéricos");
       }
    }
}