package sete01;

public class No {
    private Site site;
    private No proximo;


    public No(Site site){
        this.site = site;
        this.proximo = null;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
