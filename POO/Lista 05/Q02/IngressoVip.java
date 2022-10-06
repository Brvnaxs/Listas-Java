package Q02;

public class IngressoVip extends Ingresso{
    double valorAdicional = 0.05f;

    public IngressoVip(double valor) {
        super(valor);
        this.valorAdicional = this.valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional() {
        this.valorAdicional = this.valorAdicional;
    }
    public double calcValorAdicional(){
        return this.valor*this.valorAdicional;
    }
}
