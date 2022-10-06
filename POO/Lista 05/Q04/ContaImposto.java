package Q04;

public class ContaImposto extends ContaBancaria{
    double percentualImposto;

    public ContaImposto(String nomeCliente, String agencia, String conta, double saldo, double percentualImposto) {
        super(nomeCliente, agencia, conta, saldo);
        this.percentualImposto = percentualImposto;
    }

    public double getPercentualImposto() {
        return percentualImposto;
    }

    public void setPercentualImposto(double percentualImposto) {
        this.percentualImposto = percentualImposto;
    }
    public String calcImposto(){
       return "Percentual de imposto: "+(this.saldo - (this.saldo*this.percentualImposto));

    }
}
