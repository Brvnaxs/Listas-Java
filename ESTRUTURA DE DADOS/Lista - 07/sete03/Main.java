//Tudo errado**Corrigir:
package sete03;
public class Main {
    public static void main(String[] args) {
    Lista l1 = new Lista();
    Lista l2 = new Lista();
    l1.inserirOrdenado(3);
    l1.inserirOrdenado(9);
    l1.inserirOrdenado(27);
    l1.inserirOrdenado(47);
    l1.inserirOrdenado(1);
    l1.imprimir();
    if (l1.getInicio().getNumero() > l1.getInicio().getProximo().getNumero()){
        System.out.println("Lista não ordenada.");
    }else{
        System.out.println("Lista ordenada.");
    }
    l2.inserirOrdenado(87);
    l2.inserirOrdenado(7);
    l2.inserirOrdenado(6);
    l2.imprimir();
    //Mesclando as listas:
    No p = l2.getInicio();
    for(int i = 0; i < l2.tamanho(); i++){
        l1.inserirOrdenado(p.getNumero());
        p = p.getProximo();
    }
        System.out.println("Lista final");
    l1.imprimir();
    }
}
