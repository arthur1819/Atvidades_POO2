package br.com.atividade;

import java.util.Scanner;

public class Atividade06 {
  
    protected double saldo;
    protected double novoSaldo;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getNovoSaldo() {
        return novoSaldo;
    }
    public void setNovoSaldo(double novoSaldo) {
        this.novoSaldo = novoSaldo;
    }
    public Atividade06() {
    }

    public void executar(){

        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o saldo: ");
        this.setSaldo(sc.nextDouble());
        
        this.setNovoSaldo(this.getSaldo() + (this.getSaldo() * 2/100));

         System.out.println("Novo saldo é: " + this.getNovoSaldo());

        sc.close();
    }



 }

    


    

   
    
    

    


    

