package br.ufrn.imd.modelo;

import java.util.ArrayList;

public class Fragata extends Navio {
    public static final int TAMANHO = 4;
    public Fragata(ArrayList<Celula> auxCelulas){
        setCelulas(auxCelulas);
    }
}