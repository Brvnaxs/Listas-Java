package Q02;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso01 = new Ingresso(5.50);
        IngressoVip ingressoVip01 = new IngressoVip(5.77);
        System.out.println("O valor do ingresso comum é: $"+ingresso01.getValor());
        System.out.println("O valor do ingresso vip é: $"+ingressoVip01.getValor());
        System.out.printf("A diferença de valor é: $ %.2f",ingressoVip01.calcValorAdicional());
    }
}
