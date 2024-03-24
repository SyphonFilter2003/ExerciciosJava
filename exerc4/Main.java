import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do jogador: ");
        String nomeJogador = scanner.nextLine();

        System.out.print("Digite a pontuação inicial do jogador: ");
        int pontuacaoInicial = scanner.nextInt();

        System.out.print("Digite o nível inicial do jogador: ");
        int nivelInicial = scanner.nextInt();

        Jogador jogador1 = new Jogador(nomeJogador, pontuacaoInicial, nivelInicial);

        System.out.print("Digite o valor a ser adicionado à pontuação: ");
        int pontosAdicionais = scanner.nextInt();
        jogador1.aumentarPontuacao(pontosAdicionais);

        jogador1.exibirInformacoes();

        scanner.close();
    }
}
