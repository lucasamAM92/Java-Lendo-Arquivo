/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Controle.*;

import java.io.File;
import java.io.FileWriter;
/**
 * @author Lucas Machado
 *  link abaixo exemplifica maneiras de trabalhar com string
 *  Metodos split() e startsWith()
 * http://www.tiexpert.net/programacao/java/string.php
 * 
 * link abaixo demonstra uma maneira de escrever em um arquivo
 *  https://howtodoinjava.com/java8/java-8-write-to-file-example/
 * 
 * O seguinte link mostra uma maneira de ler arquivo em java
 * https://www.devmedia.com.br/leitura-e-escrita-de-arquivos-de-texto-em-java/25529
 * https://cursos.alura.com.br/forum/topico-como-ler-arquivo-txt-e-usar-split-e-arraylist-73532
 */
public class LerEscrever {
        //Lista com todos os dados do arquivo. 
        //A triagem das informações do arquivo serão feitas através dos ids 001 002 003 
        private static List<String> arquivoAjustado = new ArrayList<String>();

	public static void CarregaDados() {
		BufferedReader buffCaminho; // tipo para usarmos o metodo para leitura do arquivo
		
 
		try {
                   
			buffCaminho = new BufferedReader(new FileReader("C:\\Users\\Lucas Machado\\Documents\\NetBeansProjects\\AnaliseDeDadosDeVenda\\IN.txt"));
                       
			String linha = ""; //recebe a linha do conteudo de cada linha do arquivo
			while ((linha = buffCaminho.readLine()) != null) {                             
				if (linha.contains("001ç")) { //verifica se arquivo lido contem id "001"
					String[] aux = linha.split("001ç"); //auxiliar recebe o resto da string "quebrada", ou seja, sem o id seguido de "ç"
					for (int i = 1; i < aux.length; i++) {
						arquivoAjustado.add("001ç" + aux[i]);//add substring na lista
					}
				} else if (linha.contains("002ç")) {//verifica se arquivo lido contem id "002"
					String[] aux = linha.split("002ç");//auxiliar recebe o resto da string "quebrada", ou seja, sem o id seguido de "ç"
					for (int i = 1; i < aux.length; i++) {
						arquivoAjustado.add("002ç" + aux[i]);//add substring na lista
					}
				} else if (linha.contains("003ç")) {//verifica se arquivo lido contem id "003"
					String[] aux = linha.split("003ç");//auxiliar recebe o resto da string "quebrada", ou seja, sem o id seguido de "ç"
					for (int i = 1; i < aux.length; i++) {
						arquivoAjustado.add("003ç" + aux[i]);//add substring na lista
					}
				}
			}
			buffCaminho.close();
		} catch (IOException e) {
			System.out.println("TXT Nao Econtrado");
		}
	}

	public static List<String> getArquivoAjustado() {
		return arquivoAjustado;
	}
       
	private ClienteControle clientecontrole = new ClienteControle();
	private VendaControle vendacontrole = new VendaControle();
	private VendedorControle vendedorcontrole = new VendedorControle();
                   	
        
        public void arquivoDeSaida() {
		FileWriter arquivo;
		try {
                    	arquivo = new FileWriter(new File("C:/Users/Lucas Machado/Documents/NetBeansProjects/AnaliseDeDadosDeVenda/OUT.txt"));
			arquivo.write("Numero de Clientes: " + clientecontrole.totalClientes() + "\r\n"
					+ "Numero de Vendedores: " + vendedorcontrole.totalVendedores() + "\r\n"
					+ "ID venda mais cara: \r\n"
					+ "Pior Vendedor: "  );
			arquivo.close();
		} catch (IOException e) {
			System.out.println("ERROR!!!!");
		}

	}
}
