package models;

public class Funcionario extends Pessoa {

    private double salario;
    private String carteiraTrabalho;

    public Funcionario(String nome, int idade, String cpf, double salario, String carteiraTrabalho) {
        super(nome, idade, cpf);
        this.salario = salario;
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public void verificaCPF(String cpf){
        if ( cpf == null ){
            System.out.println("cpf inexistente!");
        } else {
            System.out.println("cpf existente!");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    @Override
    public String toString() {
        return "Funcionario{" + super.toString() +
                "salario=" + salario +
                ", carteiraTrabalho='" + carteiraTrabalho + '\'' +
                '}';
    }
}
