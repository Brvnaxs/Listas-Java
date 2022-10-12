package sete02;

public class ListaDupla {
    private No inicio;
    private No fim;

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public ListaDupla(){
        this.inicio = null;
        this.fim = null;
    }

    public void inserir(Pessoa pessoa){
        No item = new No(pessoa);
        if(this.inicio == null){
            this.inicio = item;
            this.fim = item;
        }else{
            this.fim.setProximo(item);
            item.setAnterior(this.fim);
            this.fim = item;
        }
    }
    public void inserirOrdenado(Pessoa pessoa) {
        No item = new No(pessoa);
        if (this.inicio == null) {
            this.inicio = item;
            this.fim = item;
        } else {
            No p = this.inicio;
            while (p != null && item.getItem().getChave() > p.getItem().getChave()) {
                p = p.getProximo();
            }if (p == null) {
                item.setAnterior(this.fim);
                this.fim.setProximo(item);
                this.fim = item;
            }else if (p.equals(this.inicio)){
                this.inicio.setAnterior(item);
                item.setProximo(this.inicio);
                this.inicio = item;
            }else{
                item.setAnterior(p.getAnterior());
                item.setProximo(p);
                p.getAnterior().setProximo(item);
                p.setAnterior(item);

            }

        }
        }

        public void copiar(ListaDupla lista) {
            No p = this.inicio;
            while (p != null) {
                lista.inserirOrdenado(p.getItem());
                p = p.getProximo();
            }
        }
        public void Imprime(){
            No p = this.inicio;
            while(p != null){
                System.out.println("Chave: "+p.getItem().getChave()+", Nome: "+p.getItem().getNome());
                p = p.getProximo();
            }
        }
        public void buscaNome(int chave){
        No p = this.inicio;
        while(p != null && p.getItem().getChave() != chave){
            p = p.getProximo();
        }
        if(p == null){
            System.out.println("Não encontrado.");
        }else{
            System.out.println("A pessoa com a chave equivalente ao número "+chave+" é "+p.getItem().getNome());
        }
        }
        public void remover(int chave){
        No p = this.inicio;
        while(p != null && p.getItem().getChave() != chave){
            p = p.getProximo();
        }
        if(p.equals(this.inicio)){
            this.inicio = this.inicio.getProximo();
            this.inicio.setAnterior(null);
        } else if (p.equals(this.fim)) {
            this.fim = this.fim.getAnterior();
            this.fim.setProximo(null);
        } else{
            p.getAnterior().setProximo(p.getProximo());
            p.getProximo().setAnterior(p.getAnterior());
        }
        }

}




