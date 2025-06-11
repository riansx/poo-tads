/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ExJOption {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite um nome");
        JOptionPane.showMessageDialog(null, "Nome digitado foi: "+nome,"Saida de dados",JOptionPane.INFORMATION_MESSAGE);
    }
}
