package models;

import utils.Pizza;

import java.util.ArrayList;

public class Cliente extends Pessoa {

        private String endereco;
        private ArrayList<Pizza> pizzasFavoritas;

        public Cliente(String nome, int idade, String cpf, String endereco) {
                super(nome, idade, cpf);
                this.endereco = endereco;
                pizzasFavoritas = new ArrayList<>();
        }

        public int encontraPizza(String nome) {
                for ( Pizza p : pizzasFavoritas ){
                        if (nome.equals(p.getNome())) {
                                return pizzasFavoritas.indexOf(p);
                        }
                }
                return -1;
        }

        public void addPizza(Pizza pizza){
                if (encontraPizza(pizza.getNome()) == -1){
                        pizzasFavoritas.add(pizza);
                } else {
                        System.out.println("Pizza já existe!");
                }
        }

        public void removePizza(String nome){
                int indice = encontraPizza(nome);
                if (indice == -1){
                        System.out.println("Pizza não cadastrada!");
                } else {
                        pizzasFavoritas.remove(indice);
                }
        }

        public String getEndereco() {
                return endereco;
        }

        public void setEndereco(String endereco) {
                this.endereco = endereco;
        }

        @Override
        public String toString() {
                return "Cliente{" + super.toString() +
                        "endereco='" + endereco + '\'' +
                        ", pizzasFavoritas=" + pizzasFavoritas +
                        '}';
        }
}
