package exheranca;

public class ExHeranca {

    public static void main(String[] args) {

        Conta contaComum = new Conta("Joao", "12345");
        System.out.println(contaComum.getCorrentista());
        contaComum.deposito(1000);
        System.out.println("Saldo da Conta comum: " + contaComum.getSaldo());
        contaComum.saque(200);
        System.out.println("Saldo apos saque: " + contaComum.getSaldo());
        
        
        

        // Testando ContaEspecial
        
        ContaEspecial contaEsp = new ContaEspecial("Maria", "54321", 500);
        System.out.println(contaEsp.getCorrentista());
        contaEsp.deposito(300);
        System.out.println("Saldo da Conta Especial: " + contaEsp.getSaldo());
        System.out.println("Tentando sacar 700 (saldo + limite = 800): " + contaEsp.saque(700));
        System.out.println("Saldo apos saque: " + contaEsp.getSaldo());
        

        // Testando Poupanca
        Poupanca contaPoup = new Poupanca("Ana", "98765");
        contaPoup.deposito(1000);
        contaPoup.setPercCorrecao(0.05); // 5%
        contaPoup.setDiaAniversario(14);
        System.out.println("Saldo da Poupanca: " + contaPoup.getSaldo());
        System.out.println("Dia do aniversario: " + contaPoup.getDiaAniversario());
        System.out.println("Correcao (%): " + (contaPoup.getPercCorrecao() * 100));

    }

}
