/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;
import Util.LerEscrever;

/**
 *
 * @author Lucas Machado
 *  link abaixo exemplifica maneiras de trabalhar com string
 *  Metodos split() e startsWith()
 * http://www.tiexpert.net/programacao/java/string.php
 */
public class ClienteControle {
    private List<Cliente> clientes = new ArrayList<>();
    
    public int totalClientes() {
	return clientes.size();
    }

    public List<Cliente> Clientes() {
	return clientes;
    }
    
    public void listaDeClientes() {
	for (String clienteAux : LerEscrever.getArquivoAjustado()) {
		if (clienteAux.startsWith("002ç")) {// verifica se existe uma string após o separador ç
			String aux[] = clienteAux.split("ç");// string auxiliar recebe a informação inteira. Porem toda vez que for encontrado ç nessa linha, será dividido em pedaços a string.
			clientes.add(new Cliente(aux[1], aux[2], aux[3])); //cada posicao do vetor auxiliar recebe respectivamente CNPJ- NAME- BUSINESS AREA        
                }
	}
    }    
}
