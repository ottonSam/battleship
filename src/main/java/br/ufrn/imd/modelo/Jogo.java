package br.ufrn.imd.modelo;

/**
 * A classe Jogo representa um jogo de batalha naval entre dois jogadores.
 * @version 1.0
 */
public class Jogo {
    private Board jogador;
    private Board bot;
    private Integer vitorias;
    private Integer derrotas;

    /**
     * O construtor da classe Jogo.
     */
    public Jogo() {
        this.jogador = new Board();
        this.bot = new Board();
        this.vitorias = 0;
        this.derrotas = 0;
    }

    /**
     * Marca a jogada em uma célula aleatória inda não atingida no tabuleiro do jogador.
     */
    public void marcarCelulaJogador() {
        if (jogador.marcarCelulaAleatoria()) {
            this.derrotas++;
            this.jogador = new Board();
            this.bot = new Board();
        }
    }

    /**
     * Marca a jogada no tabuleiro do bot nas coordenadas especificadas.
     * @param x A coordenada x da jogada
     * @param y A coordenada y da jogada
     */
    public void marcarCelulaBot(Integer x, Integer y) {
        if (bot.marcarCelula(x, y)) {
            this.vitorias++;
            this.jogador = new Board();
            this.bot = new Board();
        }
    }
}
