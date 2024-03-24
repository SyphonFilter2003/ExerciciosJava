import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o nome do titular da conta: ");
        scanner.nextLine();
        String nomeTitular = scanner.nextLine();

        ContaBancaria minhaConta = new ContaBancaria(numeroConta, nomeTitular);

        System.out.print("Digite o valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();
        minhaConta.depositar(valorDeposito);

        System.out.print("Digite o valor a ser sacado: ");
        double valorSaque = scanner.nextDouble();
        minhaConta.sacar(valorSaque);

        minhaConta.exibirInformacoes();

        scanner.close();
    }
}
