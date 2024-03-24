public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void aumentarPontuacao(int pontos) {
        if (pontos > 0) {
            pontuacao += pontos;
            System.out.println("Pontuação aumentada em " + pontos + " pontos.");
            verificarNivel();
        } else {
            System.out.println("Valor inválido para aumento de pontuação.");
        }
    }

    public void subirDeNivel(int niveis) {
        nivel += niveis;
        System.out.println("Jogador subiu " + niveis + " níveis!");
    }

    private void verificarNivel() {
        int pontosPorNivel = 100; 
        int pontosNecessarios = nivel * pontosPorNivel;

        if (pontuacao >= pontosNecessarios) {
            int niveisASubir = pontuacao / pontosPorNivel;
            subirDeNivel(niveisASubir);
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Pontuação atual: " + pontuacao);
        System.out.println("Nível atual: " + nivel);
    }
}