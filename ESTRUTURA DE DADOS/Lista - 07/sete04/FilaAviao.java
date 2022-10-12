package sete04;

public class FilaAviao {
    private No inicio;
    private No fim;

    public FilaAviao(){
        this.inicio = null;
        this.fim = null;
    }
    public void inserir(Aviao aviao){
        No no = new No(aviao);
            if(this.inicio == null){
                this.inicio = no;
                this.fim = no;
            }else{
                this.fim.setProximo(no);
                this.fim = no;
            }
    }

    public int quantidadeAvioes(){
        No p = this.inicio;
        int quant = 0;
        while (p != null){
            quant = quant +1;
            p = p.getProximo();
        }
        return quant;
    }
    public void autorizar(){
        No p = this.inicio;
        if(p == null){
            System.out.println("Não há aviões na pista de decolagem.");
        }else{
            this.inicio = this.inicio.getProximo();
        }
        System.out.println("Avião pronto para decolar.");
    }
    public void listarAvioes(){
        No p = this.inicio;
        while(p != null){
            System.out.println("ID: "+p.getItem().getId()+", Nome: "+p.getItem().getNome()+", Modelo: "+p.getItem().getModelo());
            p = p.getProximo();
        }
    }
    public void caracteristicasPrimeiro(){
        System.out.println("Próximo avião a decolar: ");
        System.out.println("ID: "+this.inicio.getItem().getId()+", Nome: "+this.inicio.getItem().getNome()+", Modelo: "+this.inicio.getItem().getModelo());
    }
}
