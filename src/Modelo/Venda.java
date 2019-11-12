/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Lucas Machado
 */
public class Venda {
    private String idVenda;
    private String precoDaVenda;
    private String nomeDoNegociador;
    
    public Venda(String idVenda, String precoDaVenda, String nomeDoNegociador ){
        this.idVenda = idVenda;
        this.precoDaVenda = precoDaVenda;
        this.nomeDoNegociador = nomeDoNegociador;       
    }//fecha construtor
    
    public String getIdVenda(){
        return idVenda;
    }
    public String getPrecoDaVenda(){
        return precoDaVenda;
    }
    public String getNomeDoNegociador(){
        return nomeDoNegociador;
    }
    
    public void setIdVenda(String idVenda ){
        this.idVenda = idVenda;
    }
    public void setPrecoDaVenda(String precoDaVenda){
         this.precoDaVenda = precoDaVenda;
    }
    public void setNomeDoNegociador(String nomeDoNegociador ){
        this.nomeDoNegociador = nomeDoNegociador; 
    }
}
