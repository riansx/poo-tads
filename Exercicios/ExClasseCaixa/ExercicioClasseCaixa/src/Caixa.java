public class Caixa {
    
    private int largura, altura, profundidade;
    
    
    Caixa(int alt, int prof, int larg){
        altura = alt;
        profundidade  = prof;
        largura = larg;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public int getLargura(){
        return largura;
    }
    
    public int getProfundidade(){
        return profundidade;
    }
    
    public void setLargura(int larg){
        largura = larg;
    }
    
    public void setAltura(int alt){
        altura = alt;
    }
    
    public void setProfundidade(int prof){
        profundidade = prof;
    }
    
    public double calcVolume(){
        double volume = largura * altura * profundidade;
        return volume;
    }
    
    
    
    
}
