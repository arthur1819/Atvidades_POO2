package br.com.atividade;

import java.util.Scanner;
public class Atividade05 {

    protected String nome;
    protected String endereco;
    protected String  telefone;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Atividade05() {
    }

    public void executar(){

        Scanner sc = new Scanner(System.in);

        System.out.print("informe o nome: ");
        this.setNome(sc.nextLine());
        System.out.print("infome o endereco: ");
        this.setEndereco(sc.nextLine());
        System.out.print("Informe o telefone: ");
        this.setTelefone(sc.nextLine());

    

        sc.close();
    }
    
}
