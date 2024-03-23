package br.com.atividade;

import java.util.Scanner;

public class Atividade10 {

    protected Double tempo;
    protected Double velocidade;
    protected double distancia;
    protected double litros;
    
    public Double getTempo() {
        return tempo;
    }
    public void setTempo(Double tempo) {
        this.tempo = tempo;
    }
    public Double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public double getLitros() {
        return litros;
    }
    public void setLitros(double litros) {
        this.litros = litros;
    }
    public Atividade10() {
    }

    public void executar(){

        Scanner sc = new Scanner(System.in); 

        System.out.print("Digite o tempo percorrido (horas): ");
        this.setTempo(sc.nextDouble());

        System.out.print("Digite a velocidade media (km/h): ");
        this.setVelocidade(sc.nextDouble());

        Double temp = (this.getTempo() * (this.getVelocidade()));
        this.setDistancia(temp);
        
        this.setLitros(this.getDistancia() / 12);

        System.out.println("A distancia percorrida é: " + this.getDistancia() + "km" + " e a quantidade de litros consumidos: " + this.getLitros() + "L");


    sc.close();

    }

    
}
