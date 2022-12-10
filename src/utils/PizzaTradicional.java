package utils;

import java.util.ArrayList;

public class PizzaTradicional extends Pizza {

    private int qtdIngredientes;
    private ArrayList<Ingredientes> ingredientes;

    public PizzaTradicional(String nome, int codigo, double preco, int qtdIngredientes) {
        super(nome, codigo, preco);
        ingredientes = new ArrayList<>();
    }

    public void verificaIngredientes(){
        if (qtdIngredientes > 2){
            System.out.println("não é possível adicionar mais ingredientes!");
        }
    }

    public int encontraIngredientes(String nome){
        for (Ingredientes i : ingredientes ){
            if (ingredientes.equals(i.getNome())){
                return ingredientes.indexOf(i);
            }
        }
        return -1;
    }

    public void addIngredientes(Ingredientes ingrediente){
         if (encontraIngredientes(ingrediente.getNome()) == -1){
             ingredientes.add(ingrediente);
         } else {
             System.out.println("Ingrediente já cadastrado!");
         }
    }

    public int getQtdIngredientes() {
        return qtdIngredientes;
    }

    @Override
    public String toString() {
        return "PizzaTradicional{" + super.toString() +
                "qtdIngredientes=" + qtdIngredientes +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
