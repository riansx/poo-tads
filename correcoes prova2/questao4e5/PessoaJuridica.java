package questao4e5;

public class PessoaJuridica extends Pessoa implements InterJuridica{
    private String cnpj, endereco;
    private Telefone foneWhats;

    public PessoaJuridica(String nome, int ddi, int ddd, int numero, String cnpj){
        super(nome, ddi, ddd, numero);
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, Telefone tel, String cnpj){
        super(nome, tel);
        this.cnpj = cnpj;
    }

    public String toString(){
        return super.toString() + "\nCnpj: "+cnpj + "\nNumero do WhatsApp: "+foneWhats.toString();
    }

    @Override
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getCnpj() {
        return "Cnpj: "+cnpj;
    }

    @Override
    public void setWhatsApp(Telefone tel) {
        this.foneWhats = tel;
    }
}
