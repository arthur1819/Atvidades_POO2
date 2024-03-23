package br.com.atividade;

import java.util.Scanner;

public class Atividade08 {

    protected double salario;
    protected double reajuste;
    protected double novoSalario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getReajuste() {
        return reajuste;
    }

    public void setReajuste(double reajuste) {
        this.reajuste = reajuste;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }

    public Atividade08() {
    }

    public void executar(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o salario: ");
        this.setSalario(sc.nextDouble());

        System.out.print("Informe o reajuste: ");
        this.setReajuste(sc.nextDouble());

        this.setNovoSalario(this.getSalario() + (this.getSalario() * this.getReajuste()));

        System.out.println("Informe o novo Salario: " + this.getNovoSalario());

    

        sc.close();

        
    }


    
}
