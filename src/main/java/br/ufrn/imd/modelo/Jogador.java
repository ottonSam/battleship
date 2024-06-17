/**
 * A classe Jogador representa um jogador do jogo de batalha naval.
 */
package br.ufrn.imd.modelo;

/**
 * A classe Jogador representa um jogador do jogo de batalha naval.
 * @version 1.0
 */
public class Jogador {
    private String nome; // O nome do jogador
    private Board board; // O tabuleiro do jogador
    private Integer vitorias; // O número de vitórias do jogador
    private Integer derrotas; // O número de derrotas do jogador

    /**
     * Construtor da classe Jogador.
     * @param nome O nome do jogador
     */
    public Jogador(String nome) {
        this.nome = nome;
        this.board = new Board(); // Inicializa o tabuleiro do jogador
        this.vitorias = 0; // Inicializa o número de vitórias do jogador
        this.derrotas = 0; // Inicializa o número de derrotas do jogador
    }

    /**
     * Obtém o nome do jogador.
     * @return O nome do jogador
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do jogador.
     * @param nome O nome a ser definido para o jogador
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o tabuleiro do jogador.
     * @return O tabuleiro do jogador
     */
    public Board getBoard() {
        return board;
    }

    /**
     * Define o tabuleiro do jogador.
     * @param board O tabuleiro a ser definido para o jogador
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * Obtém o número de vitórias do jogador.
     * @return O número de vitórias do jogador
     */
    public Integer getVitorias() {
        return vitorias;
    }

    /**
     * Define o número de vitórias do jogador.
     * @param vitorias O número de vitórias a ser definido para o jogador
     */
    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    /**
     * Obtém o número de derrotas do jogador.
     * @return O número de derrotas do jogador
     */
    public Integer getDerrotas() {
        return derrotas;
    }

    /**
     * Define o número de derrotas do jogador.
     * @param derrotas O número de derrotas a ser definido para o jogador
     */
    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }
}
