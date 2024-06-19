package br.ufrn.imd.controle;

import br.ufrn.imd.modelo.Board;
import br.ufrn.imd.modelo.Celula;

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
        Celula celula = bot.getCelula(x, y);
        if (!celula.getAtingido()) {
            if (bot.marcarCelula(x, y)) {
                this.vitorias++;
                this.jogador = new Board();
                this.bot = new Board();
            } else {
                marcarCelulaJogador();
            }
        }
    }

    /**
     * Obtém o tabuleiro do jogador.
     * @return O tabuleiro do jogador (Board)
     */
    public Board getBoardJogador() {
        return this.jogador;
    }

    /**
     * Obtém o tabuleiro do bot.
     * @return O tabuleiro do bot (Board)
     */
    public Board getBoardBot() {
        return this.bot;
    }

    /**
     * Obtém a quantidade de vitórias.
     * @return A quantidade de vitórias (Integer)
     */
    public Integer getVitorias() {
        return vitorias;
    }

    /**
     * Obtém a quantidade de derrotas.
     * @return A quantidade de derrotas (Integer)
     */
    public Integer getDerrotas() {
        return derrotas;
    }
}
