import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do contato: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o telefone do contato: ");
        String telefone = scanner.nextLine();

        Contato novoContato = new Contato(nome, telefone);

        Agenda minhaAgenda = new Agenda();
        minhaAgenda.adicionarContato(novoContato);

        System.out.print("Digite o nome do contato para buscar: ");
        String nomeBusca = scanner.nextLine();
        Contato busca = minhaAgenda.buscarContatoPorNome(nomeBusca);
        if (busca != null) {
            System.out.println("Telefone de " + busca.getNome() + ": " + busca.getTelefone());
        } else {
            System.out.println("Contato não encontrado.");
        }

        minhaAgenda.exibirTodosContatos();
    }
}
