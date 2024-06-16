package br.ufrn.imd.modelo;

public class Celula {
    private Integer x;
    private Integer y;
    private Boolean atingido = Boolean.FALSE;
    private Tipo tipo = Tipo.AGUA;

    public Celula(Integer x, Integer y) {
        this.x = x;
        this.y = y;
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

    public Boolean getAtingido() {
        return atingido;
    }

    public void setAtingido(Boolean atingido) {
        this.atingido = atingido;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
