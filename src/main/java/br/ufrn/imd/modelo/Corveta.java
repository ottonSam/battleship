package br.ufrn.imd.modelo;

import java.util.ArrayList;

/**
 * A classe Corveta representa um tipo específico de navio no jogo de batalha naval.
 *  @version 1.0
 */
public class Corveta extends Navio {
    public static final int TAMANHO = 2;

    /**
     * O construtor da classe Corveta.
     * @param auxCelulas As células que compõem a corveta
     */
    public Corveta(ArrayList<Celula> auxCelulas){
        setCelulas(auxCelulas);
    }
}
