/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MeuPrograma;

/**
 *
 * @author Josy
 */
public class BalancoTrimestral {
    public static void main(String[] args){
        double gastoJaneiro = 15000.0;
        double gastoFevereiro = 23000.0;
        double gastoMarco = 17000.0;
        double gastoTrimestre;
        
        gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
        
        System.out.println("gasto Trimestre: " + gastoTrimestre);
        
        double mediaGastos;
        mediaGastos = gastoTrimestre/3;
        
        System.out.println("Media dos gastos: "+ mediaGastos);
    }
}
