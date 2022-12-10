package program;

import models.Cliente;
import models.Funcionario;
import utils.Ingredientes;
import utils.Pizza;
import utils.PizzaEspecial;
import utils.PizzaTradicional;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Thalys", 22, "'77778888", "rua das mangabeiras");
        Funcionario fun1 = new Funcionario("Henrique", 22, "77778888", 8507.0, "10100101");

        PizzaEspecial pE1 = new PizzaEspecial("calabresa com bacon", 02, 27.60);
        PizzaTradicional pT1 = new PizzaTradicional("queijo", 03, 12.50, 2);
        Ingredientes i1 = new Ingredientes("queijo", 10);
        Ingredientes i2 = new Ingredientes("bacon", 20);
        Pizza p1 = new Pizza("queijo", 03, 12.50);

        pE1.addIngredientes(i1);
        pT1.addIngredientes(i2);

        System.out.println(c1);
        System.out.println(fun1);
        System.out.println(pT1);
        System.out.println(pE1);

        c1.addPizza(p1);

    }
}