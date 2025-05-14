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

    private double totalVenda;
    private double troco;

    CaixaRegistradora(double zeroTotal, double zeroTroco) {
        totalVenda = zeroTotal;
        troco = zeroTroco;
    }

    double getTroco() {
        return troco;
    }

    void adicionarItem(double valorItem) {
        totalVenda += valorItem;
    }

    double getTotalVenda() {
        return totalVenda;
    }

    boolean finalizarVenda(double valorDinheiro) {
        if (valorDinheiro >= totalVenda) {
            troco = valorDinheiro - totalVenda;
            return true;
        } else {
            return false;
        }
    }

}
