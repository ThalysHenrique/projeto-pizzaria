package models;

import java.util.ArrayList;

public class Pizzaria {

    private ArrayList<Cliente> clientes;
    private ArrayList<Funcionario> funcionarios;

    public Pizzaria() {
        clientes = new ArrayList<>();
        funcionarios = new ArrayList<>();
    }
}
