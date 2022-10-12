package sete04;

public class No {
    private Aviao item;
    private No proximo;

    public No(Aviao item) {
        this.item = item;
        this.proximo = null;
    }

    public Aviao getItem() {
        return item;
    }

    public void setItem(Aviao item) {
        this.item = item;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
