package br.ufrn.imd.modelo;

public class Position {
    private Integer x;
    private Integer y;
    private Tipo tipo;

    public Position(Integer x, Integer y, Tipo tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
