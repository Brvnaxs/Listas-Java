package sete01;

public class Lista {
    private No inicio;

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    private No ultimo;

    public Lista(){
        this.inicio = null;
        this.ultimo = null;
    }

    public void inserir(Site site){
        No item = new No(site);
        if(this.inicio == null){
            this.inicio = item;
            this.ultimo = item;
        }else{
            this.ultimo.setProximo(item);
            this.ultimo = item;

        }
    }
    public String busca(String nome){
        No p = this.inicio;
        while(!p.getSite().getNome().equals(nome)){
            p = p.getProximo();
        }
        if(p == null){
            return "Não Encontrado";
        }
        return p.getSite().getLink();    }
}
