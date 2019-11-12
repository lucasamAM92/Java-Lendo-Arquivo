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
public class Cliente {
    private String CNPJ;
    private String nomeCliente;
    private String areaDeNegocio;
    
    public Cliente(String CNPJ, String nomeCliente, String areaDeNegocio ){
        this.nomeCliente = nomeCliente;
        this.CNPJ = CNPJ;
        this.areaDeNegocio = areaDeNegocio;       
    }//fecha construtor
    
    public String getNomeCliente(){
        return nomeCliente;
    }
    public String getCNPJ(){
        return CNPJ;
    }
    public String getAreaDeNegocio(){
        return areaDeNegocio;
    }
    
    public void setNomeCliente(String nomeCliente ){
        this.nomeCliente = nomeCliente;
    }
    public void setCNPJ(String CNPJ){
         this.CNPJ = CNPJ;
    }
    public void setAreaDeNegocio(String areaDeNegocio ){
        this.areaDeNegocio = areaDeNegocio; 
    }
}
