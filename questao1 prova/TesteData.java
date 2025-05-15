/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao1;

/**
 *
 * @author Aluno
 */
public class TesteData {
    public static void main(String[] args) {
        Data data = new Data(01,1,2025);
       
        System.out.printf("Data atual: %s\n", data);
        System.out.println("Data com dias incrementados: "+data.incrementaDias(15));
        //System.out.println("Data com dia incrementado: "+data.incrementaDia());
        
    }
}
