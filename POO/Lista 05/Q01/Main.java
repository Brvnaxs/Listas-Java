package Q01;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar Jr","Atacante","05/02/1992","Brasileiro",1.75f,68f);
        int idade = jogador1.calculoIdade();
        int tempo = jogador1.aposentadoria(idade);
        System.out.println(jogador1.ImprimirDados());
        if(tempo == 0){
            System.out.println("O jogador está aposentado.");
        }else {
            System.out.println("Faltam " + tempo + " anos para o jogador " + jogador1.getNome() + " se aposentar.");
        }
    }

}
