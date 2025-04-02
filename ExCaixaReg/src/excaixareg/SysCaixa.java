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

        CaixaRegistradora caixa = new CaixaRegistradora(0.0, 0.0);

        System.out.println("Digite o valor do item:");
        double num = entrada.nextDouble();
        caixa.adicionarItem(num);
        
        
            

    }
}
