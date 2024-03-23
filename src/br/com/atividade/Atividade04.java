package br.com.atividade;

import java.util.Scanner;

public class Atividade04 {

    protected int num;
    protected int ant; 
    protected int suc;
    
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getAnt() {
        return ant;
    }
    public void setAnt(int ant) {
        this.ant = ant;
    }
    public int getSuc() {
        return suc;
    }
    public void setSuc(int suc) {
        this.suc = suc;
    }

    public Atividade04() {
    }

    public void executar(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        this.setNum(sc.nextInt());
      
        this.setAnt(this.getNum() - 1);
        this.setSuc(this.getNum() + 1);

        System.out.println("Antecessor: " +  this.getAnt());
        System.out.println("Sucessor: " + this.getSuc());

        
        
        sc.close();
        
    }
}
