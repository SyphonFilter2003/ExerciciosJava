import java.util.ArrayList;
import java.util.List;

class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
}

class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado: " + contato.getNome());
    }

    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null; 
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
        System.out.println("Contato removido: " + contato.getNome());
    }
    public void exibirTodosContatos() {
        System.out.println("Lista de contatos:");
        for (Contato contato : contatos) {
            System.out.println(contato.getNome() + " - " + contato.getTelefone());
        }
    }
}