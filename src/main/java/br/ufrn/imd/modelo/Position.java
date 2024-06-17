package br.ufrn.imd.modelo;

/**
 * A classe Position representa uma posição em um jogo de batalha naval, com coordenadas x e y.
 * @version 1.0
 */

public class Position {
    private Integer x;
    private Integer y;
    private Tipo tipo;

    /**
     * O construtor da classe Position.
     * @param x A coordenada x da posição
     * @param y A coordenada y da posição
     * @param tipo O tipo da posição
     */
    public Position(Integer x, Integer y, Tipo tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    /**
     * Obtém a coordenada x da posição.
     * @return A coordenada x da posição
     */
    public Integer getX() {
        return x;
    }

    /**
     * Define a coordenada x da posição.
     * @param x A coordenada x a ser definida
     */
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * Obtém a coordenada y da posição.
     * @return A coordenada y da posição
     */
    public Integer getY() {
        return y;
    }

    /**
     * Define a coordenada y da posição.
     * @param y A coordenada y a ser definida
     */
    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * Obtém o tipo da posição.
     * @return O tipo da posição
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Define o tipo da posição.
     * @param tipo O tipo a ser definido
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
