package utils;

public class Ingredientes {

    private String nome;
    private int qtdEstoque;

    public Ingredientes(String nome, int qtdEstoque) {
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public String toString() {
        return "Ingredientes{" +
                "nome='" + nome + '\'' +
                ", qtdEstoque=" + qtdEstoque +
                '}';
    }
}
