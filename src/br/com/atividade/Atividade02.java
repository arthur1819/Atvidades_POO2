package br.com.atividade;

import java.util.Scanner;

public class Atividade02 {

    protected int x;
    protected int y;
    protected int multiplicar;

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
    public int getMultiplicar() {
        return multiplicar;
    }
    public void setMultiplicar(int multiplicar) {
        this.multiplicar = multiplicar;
    }

    public Atividade02() {
    }

    public void executar() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        this.setX(sc.nextInt());
        
        System.out.print("Informe o segundo número: ");
        this.setY(sc.nextInt());

        this.setMultiplicar(this.getX()  * this.getY());

        System.out.println("A multiplicação é: " + this.getMultiplicar());
       
        sc.close();
    }
   
}

    
