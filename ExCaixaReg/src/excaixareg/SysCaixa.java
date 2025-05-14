/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excaixareg;

import java.util.Scanner;

/**
 *
 * @author rian
 */
public class SysCaixa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num;
        CaixaRegistradora caixa = new CaixaRegistradora(0.0, 0.0);

        System.out.println("Digite o valor do item:");
        for (;;) {
            num = entrada.nextDouble();
            caixa.adicionarItem(num);

            if (num == -1) {
                System.out.println("Total venda: " + caixa.getTotalVenda());
                break;
            }

        }
        System.out.println("Digite o valor em dinheiro para pagar a conta:");
        num = entrada.nextDouble();
        caixa.finalizarVenda(num);
        if (caixa.finalizarVenda(num) == false) {
            do {
                System.out.println("Valor insuficiente. Digite novamente o valor em dinheiro:");
                num = entrada.nextDouble();
                caixa.finalizarVenda(num);
            } while (caixa.finalizarVenda(num) == false);

        }
        
        System.out.println("Troco: "+caixa.getTroco());
    }
}
