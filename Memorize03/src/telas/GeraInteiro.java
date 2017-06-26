/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author Mayara Lu
 */
public class GeraInteiro {
    // A classe random() gera apenas números reais
    //Gerando números de 1 a 10
    private double nGerado = 1 + Math.random() * (11 - 1);
    //Pegando apenas a parte intera do número gerado
    private int nInteiro = (int) nGerado;
    
    public int getNInteiro(){
        return nInteiro;
    }
}
