package utils;

import java.util.ArrayList;

public class PizzaEspecial extends Pizza {

    private int qtdIngredientes;
    private ArrayList<Ingredientes> ingredientes;

    public PizzaEspecial(String nome, int codigo, double preco) {
        super(nome, codigo, preco);
        String nomeEspecial = nome + " especial";
        super.setNome(nomeEspecial);
        ingredientes = new ArrayList<>();
    }

    public void verificaQtdIngredientes(){
        if (qtdIngredientes > 7){
            System.out.println("não é possível adicionar mais ingredientes!");
        }
    }

    public int encontraIngredientes(String nome){
        for (Ingredientes i : ingredientes){
            if (nome.equals(i.getNome())){
                return ingredientes.indexOf(i);
            }
        }
        return -1;
    }

    public void addIngredientes(Ingredientes ingrediente){
        if (encontraIngredientes(ingrediente.getNome()) == -1){
            ingredientes.add(ingrediente);
        } else {
            System.out.println("ingrediente já cadastrado!");
        }
    }

    public int getQtdIngredientes() {
        return qtdIngredientes;
    }

    @Override
    public String toString() {
        return "PizzaEspecial{" + super.toString() +
                "qtdIngredientes=" + qtdIngredientes +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
