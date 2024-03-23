package br.com.atividade;

import java.util.Scanner;

public class Atividade09 {

    protected double C;
    protected double F;
   
    public double getC() {
        return C;
    }
    public void setC(double c) {
        C = c;
    }
    public double getF() {
        return F;
    }
    public void setF(double f) {
        F = f;
    }
   
    public Atividade09() {
    } 

    public void executar(){

        Scanner sc = new Scanner (System.in);

        System.out.print(" Informe o a temperatura em C: ");
        this.setC(sc.nextDouble());

        this.setF(((9 * this.getC()) + 160)/5);

        System.out.println("Qual a temperatura em F: " + this.getF());
     
        sc.close();

    }

            //-> F = ((9 * C) + 160)/5,
    
    
}
