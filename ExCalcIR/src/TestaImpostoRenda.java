/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rian
 */
public class TestaImpostoRenda {

    public static void main(String[] args) {

        ImpostoRenda salario = new ImpostoRenda(1050.00);

        System.out.println("Salario atual: " + salario.salario);

        salario.calcularIR(salario.salario);

    }
}
