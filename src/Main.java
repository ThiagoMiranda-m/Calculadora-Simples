import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o primeiro numero: ");
        double num1 = scan.nextDouble();

        System.out.println("Qual operação deseja?: ");
        String operacao = scan.next();

        System.out.println("Escreva o segundo número: ");
        double num2 = scan.nextDouble();

        switch (operacao){
            case "+":
                double resultado = num1 + num2;
                System.out.println("O resultado é: " + resultado);
                break;

            case "-":
                double resultado2 = num1 - num2;
                System.out.println("O resultado é: " + resultado2);
                break;

            case "*":
                double resultado3 = num1 * num2;
                System.out.println("O resultado é: " + resultado3);
                break;

            case "/":
                double resultado4 = num1 / num2;
                System.out.println("O resultado é: " + resultado4);
                break;

            default:
                System.out.println("Operação inválida.");
                break;
        }
    }
}
