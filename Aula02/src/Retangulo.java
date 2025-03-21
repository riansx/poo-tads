/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Retangulo {
    double largura, altura;
    
    double area(){
        double area;
        area = largura * altura;
        return area;
        
        
    }
    
    void iniciaRetangulo(double l, double a){
        largura = l;
        altura = a;
    }
}
