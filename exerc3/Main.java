import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ContaBancaria> contas = new ArrayList<>();

        while (true) {
            System.out.print("Digite o número da conta (ou -1 para sair): ");
            int numeroConta = scanner.nextInt();
            if (numeroConta == -1) {
                break;
            }
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

            contas.add(minhaConta); 
        }

        System.out.println("\nInformações das contas:");
        for (ContaBancaria conta : contas) {
            conta.exibirInformacoes();
        }
        scanner.close();
    }
}
