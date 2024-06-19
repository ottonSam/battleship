package br.ufrn.imd.modelo;

/**
 * A classe Celula representa uma célula em um tabuleiro de jogo de batalha naval.
 *  @version 1.0
 */
public class Celula {
    private Integer x;
    private Integer y;
    private Boolean atingido = Boolean.FALSE;
    private Tipo tipo = Tipo.AGUA;

    /**
     * O construtor da classe Celula.
     * @param x A coordenada x da célula
     * @param y A coordenada y da célula
     */
    public Celula(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    // Métodos getters e setters para x, y, atingido e tipo

    /**
     * Obtém a coordenada x da célula.
     * @return A coordenada x da célula
     */
    public Integer getX() {
        return x;
    }

    /**
     * Define a coordenada x da célula.
     * @param x A coordenada x a ser definida
     */
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * Obtém a coordenada y da célula.
     * @return A coordenada y da célula
     */
    public Integer getY() {
        return y;
    }

    /**
     * Define a coordenada y da célula.
     * @param y A coordenada y a ser definida
     */
    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * Verifica se a célula foi atingida.
     * @return true se a célula foi atingida, false caso contrário
     */
    public Boolean getAtingido() {
        return atingido;
    }

    /**
     * Define se a célula foi atingida.
     * @param atingido O valor a ser definido
     */
    public void setAtingido(Boolean atingido) {
        this.atingido = atingido;
    }

    /**
     * Obtém o tipo da célula.
     * @return O tipo da célula (NAVIO ou AGUA)
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Define o tipo da célula.
     * @param tipo O tipo a ser definido (NAVIO ou AGUA)
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
