package br.ufrn.imd.modelo;

import java.util.ArrayList;

/**
 * A classe Destroyer representa um tipo específico de navio no jogo de batalha naval.
 *  @version 1.0
 */
public class Destroyer extends Navio {
    public static final int TAMANHO = 5;

    /**
     * O construtor da classe Destroyer.
     * @param auxDirecao A direção do Navio
     */
    public Destroyer( Direcao auxDirecao){
        setDirecao(auxDirecao);
    }
}
