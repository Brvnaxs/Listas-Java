package sete04;

public class Main {
    public static void main(String[] args) {
        FilaAviao pistaDeDecolagem = new FilaAviao();
        pistaDeDecolagem.inserir(new Aviao(1,"Aviao01","Qualquer um"));
        pistaDeDecolagem.inserir(new Aviao(2,"Aviao02","Qualquer um2"));
        pistaDeDecolagem.inserir(new Aviao(3,"Aviao03","Qualquer um3"));
        pistaDeDecolagem.inserir(new Aviao(4,"Aviao04","Qualquer um4"));
        pistaDeDecolagem.inserir(new Aviao(5,"Aviao05","Qualquer um5"));
        pistaDeDecolagem.inserir(new Aviao(6,"Aviao06","Qualquer um6"));

        System.out.println("Aviões na fila de espera:");
        pistaDeDecolagem.listarAvioes();
        System.out.println("Quantidade de aviões na fila de espera: "+pistaDeDecolagem.quantidadeAvioes());
        pistaDeDecolagem.caracteristicasPrimeiro();
        pistaDeDecolagem.autorizar();
        System.out.println("Quantidade de aviões na fila de espera: "+pistaDeDecolagem.quantidadeAvioes());

    }
}
