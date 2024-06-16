package br.ufrn.imd.modelo;

import java.util.ArrayList;

public class Submarino extends Navio {
    public static final int TAMANHO = 3;
    public Submarino(ArrayList<Celula> auxCelulas) {
        setCelulas(auxCelulas);
    }
}