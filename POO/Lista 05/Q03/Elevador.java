package Q03;

public class Elevador {
    int andarAtual;
    int totalAndares;
    int capacidade;
    int quantPessoas;

    public Elevador(int andarAtual, int totalAndares, int capacidade, int quantPessoas) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.quantPessoas = quantPessoas;
    }
    public String Inicializar(int capacidade,int totalAndares){
        if(this.andarAtual == 0 && this.quantPessoas == 0){
            return "O elevador está em funcionamento.";
        }else {
            return "Aguarde o elevador chegar ao térreo.";
        }
    }
    public String Entrar(int pessoa){
        if(this.quantPessoas == this.capacidade){
            return "O elevador já atingiu sua capacidade total, aguarde o próximo.";
        }else{
            this.quantPessoas += pessoa;
            return "Você entrou no elevador;";
        }
    }
    public void Sair(){
        if(this.quantPessoas != 0){
         this.quantPessoas -= 1;
        }
    }
    public void Subir(){
        if(this.andarAtual == this.totalAndares){
            return;
        }else{
            this.andarAtual += 1;
        }
    }
    public void Descer(){
        if(this.andarAtual == 0){
            return;
        }else {
            this.andarAtual -= 1;
        }
    }
}
