package Q04;

public class ContaBancaria {
    String nomeCliente;
    String agencia;
    String conta;
    double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public ContaBancaria(String nomeCliente, String agencia, String conta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }
    public String sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return "Saque realizado com sucesso.";
        }else{
            return "Saldo insuficiente.";
        }
    }
    public String depositar(double valor){
        this.saldo += valor;
        return "Deposito realizado com sucesso.";
    }
}
