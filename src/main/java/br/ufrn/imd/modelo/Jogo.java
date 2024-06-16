package br.ufrn.imd.modelo;

public class Jogo {
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador vencedor;

    public Jogo(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void marcarJogador1(Integer x, Integer y) {
        if (jogador1.getBoard().marcarCelula(x, y)) {
            this.vencedor  = jogador2;
        }
    }

    public void marcarJogador2(Integer x, Integer y) {
        if (jogador2.getBoard().marcarCelula(x, y)) {
            this.vencedor  = jogador1;
        }
    }

    public Boolean jogoAtivo() {
        return this.vencedor == jogador1 || this.vencedor == jogador2;
    }

    public Jogador getVencedor() {
        return vencedor;
    }
}
