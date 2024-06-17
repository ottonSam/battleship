package br.ufrn.imd.modelo;

import java.util.ArrayList;

/**
 * A classe Submarino representa um tipo específico de navio no jogo de batalha naval.
 * @version 1.0
 */
public class Submarino extends Navio {
    public static final int TAMANHO = 3;

    /**
     * O construtor da classe Submarino.
     * @param auxCelulas As células que compõem o submarino
     */
    public Submarino(ArrayList<Celula> auxCelulas) {
        setCelulas(auxCelulas);
    }
}
