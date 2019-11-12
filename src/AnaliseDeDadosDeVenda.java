/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Util.*;
/**
 *
 * @author Lucas Machado
 */
public class AnaliseDeDadosDeVenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LerEscrever lerEscreve = new LerEscrever();
        lerEscreve.CarregaDados();
        lerEscreve.arquivoDeSaida();
    }
    
}
