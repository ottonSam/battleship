package br.ufrn.imd.modelo;

public class Jogador {
    private String nome;
    private Board board;
    private Integer vitorias;
    private Integer derrotas;

    public Jogador(String nome) {
        this.nome = nome;
        this.board = new Board();
        this.vitorias = 0;
        this.derrotas = 0;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Board getBoard() {
        return board;
    }
    public void setBoard(Board board) {
        this.board = board;
    }
    public Integer getVitorias() {
        return vitorias;
    }
    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }
    public Integer getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }
}