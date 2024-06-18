package br.ufrn.imd.modelo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * A classe Board representa o tabuleiro de jogo para o jogo de batalha naval.
 *  @version 1.0
 */
public class Board {
    private ArrayList<Navio> navios = new ArrayList<>(); // A lista de navios no tabuleiro
    private ArrayList<Celula> celulas = new ArrayList<>();  // A lista de células no tabuleiro

    /**
     * O construtor da classe Board.
     * Inicializa as células no tabuleiro.
     * Posiciona os Navios aleatóriamente no tabuleiro.
     */
    public Board() {

        Random gerador = new Random();

        for (Integer x = (Integer) 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                this.celulas.add(new Celula(x, y));
            }
        }
        Boolean adicionaCorveta = true;
        while (adicionaCorveta) {
            Direcao direcaoCorveta = Direcao.values()[gerador.nextInt(4)];
            Integer x = gerador.nextInt(10);
            Integer y = gerador.nextInt(10);
            adicionaCorveta = !posicionarNavio(x, y, new Corveta(direcaoCorveta), direcaoCorveta);
        }
        Boolean adicionaDestroyer = true;
        while (adicionaDestroyer) {
            Direcao direcaoDestroyer = Direcao.values()[gerador.nextInt(4)];
            Integer x = gerador.nextInt(10);
            Integer y = gerador.nextInt(10);
            adicionaDestroyer = !posicionarNavio(x, y, new Destroyer(direcaoDestroyer), direcaoDestroyer);
        }
        Boolean adicionaFragata = true;
        while (adicionaFragata) {
            Direcao direcaoFragata = Direcao.values()[gerador.nextInt(4)];
            Integer x = gerador.nextInt(10);
            Integer y = gerador.nextInt(10);
            adicionaFragata = !posicionarNavio(x, y, new Fragata(direcaoFragata), direcaoFragata);
        }
        Boolean adicionaSubmarino = true;
        while (adicionaSubmarino) {
            Direcao direcaoSubmarino = Direcao.values()[gerador.nextInt(4)];
            Integer x = gerador.nextInt(10);
            Integer y = gerador.nextInt(10);
            adicionaSubmarino = !posicionarNavio(x, y, new Submarino(direcaoSubmarino), direcaoSubmarino);
        }
    }

    /**
     * Obtém a lista de navios no tabuleiro.
     * @return A lista de navios no tabuleiro
     */
    public ArrayList<Navio> getNavios() {
        return navios;
    }

    /**
     * Define a lista de navios no tabuleiro.
     * @param navios A lista de navios a ser definida no tabuleiro
     */
    public void setNavios(ArrayList<Navio> navios) {
        this.navios = navios;
    }

    /**
     * Obtém a lista de células no tabuleiro.
     * @return A lista de células no tabuleiro
     */
    public ArrayList<Celula> getCelulas() {
        return celulas;
    }

    /**
     * Define a lista de células no tabuleiro.
     * @param celulas A lista de células a ser definida no tabuleiro
     */
    public void setCelulas(ArrayList<Celula> celulas) {
        this.celulas = celulas;
    }

    // Métodos privados para gerenciar a posição dos navios e marcar células

    /**
     * Limpa as posições ocupadas por um navio no tabuleiro.
     * @param navio O navio a ser removido do tabuleiro
     */
    private void limparPosicoes(Navio navio) {
        for (Celula celula : navio.getCelulas()) {
            celula.setTipo(Tipo.AGUA);
        }
    }

    /**
     * Marca as posições ocupadas por um navio no tabuleiro.
     * @param navio O navio a ser marcado no tabuleiro
     */
    private void marcarPosicooes(Navio navio) {
        for (Celula celula : navio.getCelulas()) {
            celula.setTipo(Tipo.NAVIO);
        }
    }

    /**
     * Obtém a célula no tabuleiro com as coordenadas especificadas.
     * @param x A coordenada x da célula
     * @param y A coordenada y da célula
     * @return A célula com as coordenadas especificadas, ou null se não encontrada
     */
    private Celula getCelula(Integer x, Integer y) {
        for (Celula celula : celulas) {
            if (celula.getX().equals(x) && celula.getY().equals(y)) {
                return celula;
            }
        }
        return null;
    }

    /**
     * Posiciona um navio no tabuleiro com base nas coordenadas, navio e direção fornecidos.
     * @param x A coordenada x
     * @param y A coordenada y
     * @param navio O navio a ser posicionado
     * @param direcao A direção do navio
     * @return true se o navio for posicionado com sucesso, false caso contrário
     */
    public boolean posicionarNavio(Integer x, Integer y, Navio navio, Direcao direcao) {
        ArrayList<Celula> auxCelulas = new ArrayList<>();
        limparPosicoes(navio);
        if (direcao.equals(Direcao.CIMA) && y > navio.getTamanho()) {
            for (Integer i = 0; i < navio.getTamanho(); i++) {
                auxCelulas.add(getCelula(x, y-i));
            }
        }
        else if (direcao.equals(Direcao.DIREITA) && x < 10 - navio.getTamanho()) {
            for (Integer i = 0; i < navio.getTamanho(); i++) {
                auxCelulas.add(getCelula(x + i, y));
            }
        }
        else if (direcao.equals(Direcao.BAIXO) && y < 10 - navio.getTamanho()) {
            for (Integer i = 0; i < navio.getTamanho(); i++) {
                auxCelulas.add(getCelula(x, y+i));
            }
        } else if (direcao.equals(Direcao.ESQUERDA) && x > navio.getTamanho()) {
            for (Integer i = 0; i < navio.getTamanho(); i++) {
                auxCelulas.add(getCelula(x - i, y));
            }
        }
        for (Navio auxNavio: navios) {
            if (!auxNavio.equals(navio)) {
                for (Celula celula: auxNavio.getCelulas()) {
                    if (auxCelulas.contains(celula)) {
                        return false;
                    }
                }
            }
        }
        navio.setCelulas(auxCelulas);
        marcarPosicooes(navio);
        return false;
    }

    /**
     * Marca uma célula no tabuleiro como atingida e verifica se todos os navios foram afundados.
     * @param x A coordenada x da célula
     * @param y A coordenada y da célula
     * @return true se todos os navios foram afundados, false caso contrário
     */
    public Boolean marcarCelula(Integer x, Integer y) {
        for (Celula celula : celulas) {
            if (celula.getX().equals(x) && celula.getY().equals(y)) {
                celula.setAtingido(true);
            }
        }
        for (Navio navio : navios) {
            if (navio.aindaFlutua()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Marca uma célula no aleatória ainda não marcada no tabuleiro como atingida e verifica se todos os navios foram afundados.
     * @return true se todos os navios foram afundados, false caso contrário
     */
    public Boolean marcarCelulaAleatoria() {
        Random gerador = new Random();
        Integer x = gerador.nextInt(10);
        Integer y = gerador.nextInt(10);
        while (!(Objects.requireNonNull(getCelula(x, y)).getAtingido())) {
            x = gerador.nextInt(10);
            y = gerador.nextInt(10);
        }
        return marcarCelula(x, y);
    }
}
