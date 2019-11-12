/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Venda;
import java.util.ArrayList;
import java.util.List;
import Util.LerEscrever;
import java.*;

/**
 * @author Lucas Machado
 *  link abaixo exemplifica maneiras de trabalhar com string
 *  Metodos split() e startsWith()
 * http://www.tiexpert.net/programacao/java/string.php
 */
public class VendaControle {
    
    private List<Venda> venda = new ArrayList<Venda>();
    
    public int totalVendas() {
		return venda.size();
	}

	public List<Venda> Venda() {
		return venda;
	}
    
        public void listaDeVendas() {
		for (String vendaAux : LerEscrever.getArquivoAjustado()) {
                    if (vendaAux.startsWith("003ç")) {// verifica se existe uma string após o separador ç
			String aux[] = vendaAux.split("ç");// string auxiliar recebe a informação inteira. Porem toda vez que for encontrado ç nessa linha, será dividido em pedaços a string.
			venda.add(new Venda(aux[1], aux[2], aux[3]));//cada posicao do vetor auxiliar recebe respectivamente
                    }
                }
	} 
}
