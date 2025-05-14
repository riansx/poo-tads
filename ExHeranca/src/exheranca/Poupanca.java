/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exheranca;

public class Poupanca extends Conta {
    
    public Poupanca(String nomeCorrentista, String conta){
        super(nomeCorrentista, conta);
    }
    
    private double percCorrecao;
    private int diaAniversario; 
    
    
    public void setPercCorrecao(double perc){
        percCorrecao = perc;
    }
    
    public void setDiaAniversario(int dia){
        diaAniversario = dia;
    }
    
    public double getPercCorrecao(){
        return percCorrecao;
    }
    
    public int getDiaAniversario(){
        return diaAniversario;
    }
}
