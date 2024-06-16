package br.ufrn.imd.modelo;

import java.util.ArrayList;

public abstract class Navio {
    private ArrayList<Celula> celulas;
    private Boolean afundado = false;
    private Direcao direcao = Direcao.CIMA;
    private Integer tamanho;

    public Boolean aindaFlutua() {
        if (!this.afundado) {
            for (Celula celula : this.celulas) {
                if (!celula.getAtingido()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void rotacionarNavio(){
        if (Direcao.CIMA.equals(this.direcao)) {
            this.direcao = Direcao.DIREITA;
        }
        else if (Direcao.DIREITA.equals(this.direcao)) {
            this.direcao = Direcao.BAIXO;
        }
        else if (Direcao.BAIXO.equals(this.direcao)) {
            this.direcao = Direcao.ESQUERDA;
        }
        else {
            this.direcao = Direcao.CIMA;
        }
    }

    public ArrayList<Celula> getCelulas() {
        return celulas;
    }
    public void setCelulas(ArrayList<Celula> celulas) {
        this.celulas = celulas;
    }
    public Boolean getAfundado() {
        return afundado;
    }
    public void setAfundado(Boolean afundado) {
        this.afundado = afundado;
    }
    public Integer getTamanho() {
        return tamanho;
    }
    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }
}