/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifam.exheranca;

/**
 *
 * @author Aluno
 */
public class QuadrilateroHeranca {

    public static void main(String args[]) {
        double area;
        Quadrado obQuadrado = new Quadrado(5.5);
        //invocando o método para calcular a área
        area = obQuadrado.calcAreaQ(obQuadrado.getLargura());
        System.out.println("Quadrado: " + area);

        //invoc. método para atribuir novos valores
        area = obQuadrado.calcAreaQ(3.2);
        System.out.println("Retangulo  2: " + area);

        //invocando o método para retornar altura
        System.out.println("Altura do Quadrado:"
                + obQuadrado.altura);
    }

}
