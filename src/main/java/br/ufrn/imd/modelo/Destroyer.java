package br.ufrn.imd.modelo;

import java.util.ArrayList;

public class Destroyer extends Navio {
    public static final int TAMANHO = 5;
    public Destroyer(ArrayList<Celula> auxCelulas){
        setCelulas(auxCelulas);
    }
}