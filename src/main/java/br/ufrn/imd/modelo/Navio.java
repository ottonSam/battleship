package br.ufrn.imd.modelo;

import java.util.ArrayList;

/**
 * A classe abstrata Navio representa um navio em um jogo de batalha naval.
 * @version 1.0
 */
public abstract class Navio {
    private ArrayList<Celula> celulas;
    private Boolean afundado = false;
    private Direcao direcao = Direcao.CIMA;
    private Integer tamanho;

    /**
     * Verifica se o navio ainda está flutuando (não afundado).
     * @return true se o navio ainda está flutuando, false caso contrário
     */
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

    /**
     * Rotaciona o navio para a próxima direção possível.
     */
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

    // Métodos getters e setters para celulas, afundado, tamanho e direcao

    /**
     * Obtém as células ocupadas pelo navio.
     * @return As células ocupadas pelo navio
     */
    public ArrayList<Celula> getCelulas() {
        return celulas;
    }

    /**
     * Define as células ocupadas pelo navio.
     * @param celulas As células a serem definidas
     */
    public void setCelulas(ArrayList<Celula> celulas) {
        this.celulas = celulas;
    }

    /**
     * Verifica se o navio foi afundado.
     * @return true se o navio foi afundado, false caso contrário
     */
    public Boolean getAfundado() {
        return afundado;
    }

    /**
     * Define se o navio foi afundado.
     * @param afundado O valor a ser definido
     */
    public void setAfundado(Boolean afundado) {
        this.afundado = afundado;
    }

    /**
     * Obtém o tamanho do navio.
     * @return O tamanho do navio
     */
    public Integer getTamanho() {
        return tamanho;
    }

    /**
     * Define o tamanho do navio.
     * @param tamanho O tamanho a ser definido
     */
    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * Obtém a direção do navio.
     * @return A direção do navio
     */
    public Direcao getDirecao() {
        return direcao;
    }

    /**
     * Define a direção do navio.
     * @param direcao A direção a ser definida
     */
    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }
}
