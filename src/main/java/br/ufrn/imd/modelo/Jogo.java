package br.ufrn.imd.modelo;

/**
 * A classe Jogo representa um jogo de batalha naval entre dois jogadores.
 * @version 1.0
 */
public class Jogo {
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador vencedor;

    /**
     * O construtor da classe Jogo.
     * @param jogador1 O primeiro jogador
     * @param jogador2 O segundo jogador
     */
    public Jogo(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    /**
     * Marca a jogada do jogador 1 nas coordenadas especificadas.
     * @param x A coordenada x da jogada
     * @param y A coordenada y da jogada
     */
    public void marcarJogador1(Integer x, Integer y) {
        if (jogador1.getBoard().marcarCelula(x, y)) {
            this.vencedor  = jogador2;
        }
    }

    /**
     * Marca a jogada do jogador 2 nas coordenadas especificadas.
     * @param x A coordenada x da jogada
     * @param y A coordenada y da jogada
     */
    public void marcarJogador2(Integer x, Integer y) {
        if (jogador2.getBoard().marcarCelula(x, y)) {
            this.vencedor  = jogador1;
        }
    }

    /**
     * Verifica se o jogo ainda está ativo (sem vencedor definido).
     * @return true se o jogo ainda está ativo, false caso contrário
     */
    public Boolean jogoAtivo() {
        return this.vencedor == jogador1 || this.vencedor == jogador2;
    }

    /**
     * Obtém o jogador vencedor do jogo.
     * @return O jogador vencedor do jogo
     */
    public Jogador getVencedor() {
        return vencedor;
    }
}
