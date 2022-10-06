package Q04;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria01 = new ContaBancaria("Bruna","0001","0002",500.00);
        ContaImposto contaImposto01 = new ContaImposto("Bruna","0000","0000",500.00, 0.05);
        System.out.println(contaBancaria01.depositar(500.50));
        System.out.println(contaBancaria01.sacar(250.30));
        System.out.println("Saldo atual: "+contaBancaria01.getSaldo());
        System.out.println(contaImposto01.calcImposto());
    }
}
