package Q01;

public class Jogador {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    private String nome;
    private String posicao;
    private String data_nascimento;
    private String nacionalidade;
    private float altura;
    private float peso;

    public Jogador(String nome, String posicao, String data_nascimento, String nacionalidade, float altura, float peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.data_nascimento = data_nascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }
    public int calculoIdade(){
        int ano = Integer.parseInt(this.data_nascimento.substring(6));
        return  2022 - ano;
    }
    //defesa se aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35.
    public int aposentadoria(int idade){
        int tempo = 0;
        if(this.posicao.equalsIgnoreCase("Defesa")){
            tempo = 40 - idade;
        } else if (this.posicao.equalsIgnoreCase("Meio-campo")) {
            tempo = 38 - idade;
        } else if (this.posicao.equalsIgnoreCase("Atacante")) {
            tempo = 35 - idade;
        }
        return tempo;
    }
    public String ImprimirDados(){
        return "Nome: " + this.nome + "\nPosição: " + this.posicao + "\nData de nascimento: " + this.data_nascimento + "\nNacionalidade: "+this.nacionalidade+"\nPeso: "+this.peso+"kg"+"\nAltura: "+this.altura;

    }

}
