package br.com.atividade;

import java.util.Scanner;

public class Atividade01 {

    protected int x;
    protected int y;
    protected int somar;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getSomar() {
        return somar;
    }
    public void setSomar(int somar) {
        this.somar = somar;
    }

    public Atividade01() {
    }

    public void executar() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        this.setX(sc.nextInt());
        
        System.out.print("Informe o segundo número: ");
        this.setY(sc.nextInt());

        this.setSomar(this.getX()  + this.getY());

        System.out.println("A soma é: " + this.getSomar());


    sc.close();
    }

    
    
}
