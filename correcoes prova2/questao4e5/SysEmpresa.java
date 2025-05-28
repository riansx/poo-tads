package questao4e5;

public class SysEmpresa {
    public static void main(String[] args) {

        PessoaJuridica emp1 = new PessoaJuridica("JBS", 55, 92, 991934242, "123.4124.141.34");
        Telefone whats = new Telefone(55,92,995234131);
        emp1.setWhatsApp(whats);

        System.out.println(emp1);

    }
}
