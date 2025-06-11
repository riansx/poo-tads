/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaFile;

import java.io.Serializable;

/**
 *
 * @author Aluno
 */
public class Caixa implements Serializable {

    private int altura, largura, profundidade;

    public Caixa() {
    }

    public void setAltura(int alt) {
        altura = alt;
    }

    public void setLargura(int lar) {
        largura = lar;
    }
    
    public void setProfundidade(int prof){
        profundidade = prof;
    }
}
