package sete03;

import sete02.ListaDupla;

public class Lista {
    private No inicio;
    private No fim;

    public Lista(){
        this.inicio = null;
        this.fim = null;
    }
    public void inserir(int item){
        No no = new No(item);
        if(this.inicio == null){
            this.inicio = no;
            this.fim = no;
        }else{
            this.fim.setProximo(no);
            this.fim = no;
        }
    }
    public String verifica(){
        if(this.inicio.getNumero() > this.inicio.getProximo().getNumero() && this.inicio.getProximo() != null){
            return "Lista não ordenada.";
        }else {
            return "Lista ordenada.";
        }
    }
    public void copiar(Lista lista) {
        No p = this.inicio;
        while (p != null) {
            lista.inserirOrdenado(p.getNumero());
            p = p.getProximo();
        }
    }
    public void inserirOrdenado(int numero) {
        No no = new No(numero);
        if (this.inicio == null) {
            this.inicio = no;
            this.fim = no;
        } else {
            No p = this.inicio;
            while (p != null && no.getNumero() > p.getNumero()) {
                p = p.getProximo();
            }
            if (p == null) {
                this.fim.setProximo(no);
                this.fim = no;
            } else if (p.equals(this.inicio)) {
                no.setProximo(this.inicio);
                this.inicio = no;
            } else {
                //Corrigir o inserir no meio:
                p.setProximo(no);
            }
        }
    }
    public void imprimir(){
        No p = this.inicio;
        while(p != null){
            System.out.println(p.getNumero());
            p = p.getProximo();
        }
    }
    public int tamanho(){
        No p = this.inicio;
        int quant = 0;
        while (p != null){
            quant = quant +1;
            p = p.getProximo();
        }
        return quant;
    }

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
    public void ordena(){
        No p = this.inicio;
        while(p != null){
            if(p.getNumero() > p.getProximo().getNumero() && p.getProximo() != null){
                p.getProximo().setNumero(p.getNumero());
                p.setNumero(p.getProximo().getNumero());
                p = p.getProximo();
            }
        }
    }
}
