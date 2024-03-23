package br.com.atividade;

import java.util.Scanner;

public class Atividade07 {

    protected double area;
    protected double perimetro;
    protected double base;
    protected double altura;


    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void executar(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da base: ");
        this.setBase(sc.nextDouble());

        System.out.print("Informe o valor da altura: ");
        this.setAltura(sc.nextDouble());

        this.setArea(this.getBase() * this.getAltura());

        System.out.println("O valor da área é: " + this.getArea());

        this.setPerimetro(this.getBase() + this.getAltura());

        System.out.println("O valor do Perimetro é: " + this.getPerimetro());


        sc.close();
    }
   

  
    
    
    
}
