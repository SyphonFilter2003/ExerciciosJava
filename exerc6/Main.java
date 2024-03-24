import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contato> listaContatos = new ArrayList<>();

        while (true) {
            System.out.print("Informe o nome do contato (ou digite 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break; 
            }

            System.out.print("Informe o telefone do contato: ");
            String telefone = scanner.nextLine();

            Contato novoContato = new Contato(nome, telefone);
            listaContatos.add(novoContato);
        }

        System.out.print("Digite o nome do contato para buscar: ");
        String nomeBusca = scanner.nextLine();

        Contato busca = buscarContatoPorNome(listaContatos, nomeBusca);
        if (busca != null) {
            System.out.println("Telefone de " + busca.getNome() + ": " + busca.getTelefone());
        } else {
            System.out.println("Contato não encontrado.");
        }

        scanner.close();
    }

    public static Contato buscarContatoPorNome(List<Contato> contatos, String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }
}
