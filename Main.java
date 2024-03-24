import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Digite o número da operação desejada: ");
        int escolha = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();

        double resultado = 0.0;
        switch (escolha) {
            case 1:
                resultado = Calculadora.adiçao(a, b);
                break;
            case 2:
                resultado =  Calculadora.subtrair(a, b);
                break;
            case 3:
                resultado = Calculadora.multiplicar(a, b);
                break;
            case 4:
                resultado = Calculadora.dividir(a, b);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
    

