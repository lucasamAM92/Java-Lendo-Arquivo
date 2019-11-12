/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import Modelo.Vendedor;
import java.util.ArrayList;
import java.util.List;
import Util.LerEscrever;

/**
 * @author Lucas Machado
 *  link abaixo exemplifica maneiras de trabalhar com string
 *  Metodos split() e startsWith()
 * http://www.tiexpert.net/programacao/java/string.php
 */
public class VendedorControle {
    
        private List<Vendedor> vendedores = new ArrayList<Vendedor>();
        
        public int totalVendedores(){
		return vendedores.size();
	}   

	public List<Vendedor> Vendedores() {
		return vendedores;
	}
        
       public void listaDeVendedores() {
		for (String vendedorAux : LerEscrever.getArquivoAjustado()) {
			if (vendedorAux.startsWith("001ç")) {// verifica se existe uma string após o separador ç
				String aux[] = vendedorAux.split("ç");// string auxiliar recebe a informação inteira. Porem toda vez que for encontrado ç nessa linha, será dividido em pedaços a string.
				vendedores.add(new Vendedor(aux[1], aux[2],(aux[3])));//cada posicao do vetor auxiliar recebe respectivamente CPF - NOME - SALARIO     
			}

		}
	}

    
    
    
    
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
