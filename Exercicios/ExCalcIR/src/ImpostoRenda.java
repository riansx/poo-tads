/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rian
 */
public class ImpostoRenda {

    double salario;
    
    ImpostoRenda(double sal){
        salario = sal;
    };

    void calcularIR(double salario) {
        if (salario <= 1050.00) {
            System.out.println("Isento.");
        } else if (salario > 1050.00 && salario <= 2500.00) {
            salario = salario - (salario * 15) / 100;
            System.out.println("Salario atualizado com desconto do IR: " + salario);
        } else if (salario > 2500.00 && salario <= 7500.00) {
            salario = salario - (salario * 25) / 100;
            System.out.println("Salario atualizado com desconto do IR: " + salario);
        } else if (salario > 7500.00) {
            salario = salario - (salario * 35) / 100;
            System.out.println("Salario atualizado com desconto do IR: " + salario);
        }

    }
}
