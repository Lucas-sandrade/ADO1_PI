package entities;

public class Leao {
    private String nome;
    private String raca;
    private String cor;
    private int idade;
    private int velocidadeAtual;
    public Leao() {

    }

    public Leao(String nome, String raca, String cor, int idade, int velocidadeAtual) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String modelo) {
        this.nome = modelo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void correr() {
        this.velocidadeAtual += 10;
    }

    public void correr(int novaVelocidade) {
        this.velocidadeAtual += novaVelocidade;
    }

    public void parar() {
        this.velocidadeAtual -= 10;
    }
}
