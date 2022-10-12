package sete02;

public class Main {
    public static void main(String[] args) {
        ListaDupla l1 = new ListaDupla();
        ListaDupla l2 = new ListaDupla();
        l1.inserirOrdenado(new Pessoa("Lula",29));
        l1.inserirOrdenado(new Pessoa("Lulala",18));
        l1.inserirOrdenado(new Pessoa("Lula Presidente",66));
        l1.inserirOrdenado(new Pessoa("Dilmãe",56));
        l1.inserirOrdenado(new Pessoa("Lula pai do Brasil",97));
        l1.inserirOrdenado(new Pessoa("Luiz Inacio",13));
        System.out.println("Lista 1: ");
        l1.Imprime();
        //l1.copiar(l2);
        //System.out.println("Lista 2:");
        //l2.Imprime();
        //l1.remover(97);
        //System.out.println("nova:");
        //l1.Imprime();
        l1.buscaNome(3);

    }
}
