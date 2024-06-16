package br.ufrn.imd.modelo;

import java.util.ArrayList;

public class Corveta extends Navio {
    public static final int TAMANHO = 2;

    public Corveta(ArrayList<Celula> auxCelulas){
        setCelulas(auxCelulas);
    }
}