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
     
        Retangulo retangulo = new Retangulo();
        
        
        
        double area;
       
        retangulo.iniciaRetangulo(5.5,2.2);
        
        area = retangulo.area();
        System.out.println(" "+area);
    }

}
