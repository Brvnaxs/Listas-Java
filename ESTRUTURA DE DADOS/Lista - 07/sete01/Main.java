package sete01;

public class Main {
    public static void main(String[] args) {
        Lista l1 = new Lista();
        l1.inserir(new Site("sebrae","sebrae.com"));
        l1.inserir(new Site("friv","friv.com"));
        l1.inserir(new Site("youtube","youtube.com"));

        System.out.println(l1.busca("sebrae"));
    }
}
