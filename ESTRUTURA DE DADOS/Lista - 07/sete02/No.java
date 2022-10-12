package sete02;

public class No {
    private No anterior;
    private Pessoa item;
    private No proximo;

    public No(Pessoa item) {
        this.anterior = null;
        this.item = item;
        this.proximo = null;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public Pessoa getItem() {
        return item;
    }

    public void setItem(Pessoa item) {
        this.item = item;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
