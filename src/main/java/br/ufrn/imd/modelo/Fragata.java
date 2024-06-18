package br.ufrn.imd.modelo;

import java.util.ArrayList;

/**
 * A classe Fragata representa um tipo específico de navio no jogo de batalha naval.
 * @version 1.0
 */
public class Fragata extends Navio {
    public static final int TAMANHO = 4;

    /**
     * O construtor da classe Fragata.
     * @param auxDirecao A direção do Navio
     */
    public Fragata( Direcao auxDirecao){
        setDirecao(auxDirecao);
    }
}
