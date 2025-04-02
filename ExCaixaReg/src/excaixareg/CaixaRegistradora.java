/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excaixareg;

/**
 *
 * @author rian
 */
public class CaixaRegistradora {
    
    private double  totalVenda;
    private double troco;
    
    CaixaRegistradora(double zeroTotal, double zeroTroco){
        totalVenda = zeroTotal;
        troco = zeroTroco;
    }
    
    void adicionarItem(double valorItem){
        totalVenda += valorItem; 
    }
    
    double getTroco(){
        return troco;
    }
    
    double getSaldo(){
        return totalVenda;
    }
    
    boolean finalizarVenda(double valorDinheiro){
        if(valorDinheiro >= totalVenda){
            getTroco();
            return true;
        }else
            return false;
    }
    
}
