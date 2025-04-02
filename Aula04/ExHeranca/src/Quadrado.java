/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifam.exheranca;

/**
 *
 * @author Aluno
 */
public class Quadrado extends Quadrilatero {

    double area;
    //construtor da classe quadrada

    Quadrado(double l) {
        inicia(l, l);
    }
    //calcula a área

    double calcAreaQ(double l) {
        area = calcArea(l, l);
        return area;
    }

    //atribui valores para os lados do quadrado
    void iniciaQ(double l) {
        inicia(l, l);
    }

}
