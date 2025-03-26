/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class TesteRetangulo {

    public static void main(String[] args) {
     
        Retangulo retangulo = new Retangulo(5.5,2.2);
        
        double largura = 5.5, altura = 2.2;
        double area;
       
     //   retangulo.iniciaRetangulo(5.5,2.2);
        
        area = retangulo.area();
        System.out.println(" "+retangulo.diagonal(largura, altura));
    }

}
