package br.ufrn.imd.modelo;

import java.util.ArrayList;

public class Board {
    private ArrayList<Navio> navios = new ArrayList<>();
    private ArrayList<Celula> celulas = new ArrayList<>();

    public Board() {
        for (Integer x = 0; x < 10; x++) {
            for (Integer y = 0; y < 10; y++) {
                this.celulas.add(new Celula(x, y));
            }
        }
    }

    public ArrayList<Navio> getNavios() {
        return navios;
    }

    public void setNavios(ArrayList<Navio> navios) {
        this.navios = navios;
    }

    public ArrayList<Celula> getCelulas() {
        return celulas;
    }

    public void setCelulas(ArrayList<Celula> celulas) {
        this.celulas = celulas;
    }

    private void limparPosicoes(Navio navio) {
        for (Celula celula : navio.getCelulas()) {
            celula.setTipo(Tipo.AGUA);
        }
    }

    private void marcarPosicooes(Navio navio) {
        for (Celula celula : navio.getCelulas()) {
            celula.setTipo(Tipo.NAVIO);
        }
    }

    private Celula getCelula(Integer x, Integer y) {
        for (Celula celula : celulas) {
            if (celula.getX().equals(x) && celula.getY().equals(y)) {
                return celula;
            }
        }
        return null;
    }

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
}