/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifam.exheranca;

/**
 *
 * @author Aluno
 */
public class Quadrilatero {

    double largura, altura;
    //método para atribuir valores para os lados

    void inicia(double l, double a) {
        largura = l;
        altura = a;
    }

    double calcArea(double l, double a) {
        return l * a;
    }

    double getLargura() {
        return largura;
    }
}
