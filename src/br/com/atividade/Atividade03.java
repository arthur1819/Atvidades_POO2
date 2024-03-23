package br.com.atividade;

import java.util.Scanner;

public class Atividade03 {

    protected double nota1;
    protected double nota2;
    protected double nota3;
    protected double resultado;

    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public Atividade03() {
    }

    public void executar(){

      Scanner sc = new Scanner(System.in);

      System.out.print("Informe a primeira nota: ");
      this.setNota1(sc.nextDouble());
      System.out.print("Informe a segunda nota: ");
      this.setNota2(sc.nextDouble());
      System.out.print("Informe a terceira nota: ");
      this.setNota3(sc.nextDouble());

      this.setResultado((this.getNota1() + this.getNota2() +    this.getNota3()) / 3);

     System.out.println("A média Aritmética é: " + this.getResultado());

      sc.close();
    }
}
