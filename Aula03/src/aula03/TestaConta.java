/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

/**
 *
 * @author Aluno
 */
public class TestaConta {

    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente("jair", 123132);
       // conta.saldoConta = 0;
        
        //System.out.println("correntista: "+conta.correntista);
        //System.out.println("conta: "+conta.nConta);

    
        System.out.println("novo saldo: "+conta.retornarSaldo());
        
        conta.depositar(5000);
        System.out.println("novo saldo: "+conta.retornarSaldo());
        
        if(conta.retirar(7000)){
            System.out.println("Saque realizado");
            System.out.println("novo saldo: "+conta.retornarSaldo());
        }else{
            System.out.println("Saldo insuficiente");
            System.out.println("novo saldo: "+conta.retornarSaldo());
        }
            
       
       /* System.out.println("novo saldo: " + conta.saldoConta);
        
        System.out.println("novo saldo: "+ conta.retirar(conta.saldoConta, 200.000));
        
        System.out.println("saldo: "+ conta.retornarSaldo());*/

    }
}
