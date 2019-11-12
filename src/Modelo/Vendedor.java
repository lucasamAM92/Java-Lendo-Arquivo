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
public class Vendedor {
     private String CPF;
    private String nomeVendedor;
    private String salario;
    
    public Vendedor(String CPF, String nomeVendedor, String salario ){
        this.nomeVendedor = nomeVendedor;
        this.CPF = CPF;
        this.salario = salario;       
    }//fecha construtor
    
    public String getNomeVendedor(){
        return nomeVendedor;
    }
    public String getCPF(){
        return CPF;
    }
    public String getAreaDeNegocio(){
        return salario;
    }
    
    public void setNomeVendedor(String nomeVendedor ){
        this.nomeVendedor = nomeVendedor;
    }
    public void setCPF(String CPF){
         this.CPF = CPF;
    }
    public void setSalario(String salario ){
        this.salario = salario; 
    }
}
