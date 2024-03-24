import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a marca do carro: ");
        String marca = scanner.nextLine();

        System.out.print("Informe o modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Informe o ano do carro: ");
        int ano = scanner.nextInt();

        Carro meuCarro = new Carro(marca, modelo, ano);

        System.out.print("Digite o valor de aceleração (em km/h): ");
        double aceleracao = scanner.nextDouble();
        meuCarro.acelerar(aceleracao);

        System.out.print("Digite o valor de frenagem (em km/h): ");
        double frenagem = scanner.nextDouble();
        meuCarro.frear(frenagem);

        meuCarro.exibirInformacoes();
    }
}
