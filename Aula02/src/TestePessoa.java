/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1;
        //Instanciando o objeto p1
        p1 = new Pessoa();
        
        p1.nome = "John";
        p1.endereco = "Rua y";
        p1.telefone = "911223300";
        p1.sexo = 'M';
        
        System.out.println("Nome: "+p1.nome);
    }
}
