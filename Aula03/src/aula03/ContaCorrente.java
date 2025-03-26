/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

/**
 *
 * @author Aluno
 */
public class ContaCorrente {
    
    
    
    String correntista;
    private int nConta;
    private double saldoConta;
    
    ContaCorrente(String nome, int nCnt){
        correntista = nome;
        nConta = nCnt;
    }
            
    void depositar(double deposito){
        saldoConta += deposito;
    }
    
    boolean retirar(double retirada){
        if(saldoConta<retirada)
            return false;
        else{
            saldoConta -= retirada;
            return true;
            
        }
            

    }
    
    double retornarSaldo(){
        return saldoConta;
    }
}
