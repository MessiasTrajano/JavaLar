package Contas;

import Sistema.Planeta;

import java.util.ArrayList;

public class DistEuclidiana extends Calc {
    public void calcEuclidiana(ArrayList<Planeta> p1){
        System.out.println("---------------------EUCLIDIANA---------------------");


        for(int i = 0; i< p1.size(); i++){
            for(int a = 0; a< p1.size(); a++){
                planeta = p1.get(i);
                planeta2 = p1.get(a);

                if(planeta.pontoX() - planeta2.pontoX() == 0 && planeta.pontoY() - planeta2.pontoY() == 0 ){
                    continue;
                }else{
                    int valor1 = Math.abs(planeta.pontoX() - planeta2.pontoX());
                    int valor2 = Math.abs(planeta.pontoY() - planeta2.pontoY());
                    Math.pow(valor1, 2);
                    Math.pow(valor2, 2);


                    System.out.printf("Distancia Euclidiana do " + planeta.getNome() + " com " + planeta2.getNome() + " é: " + "%.2f",Math.sqrt(valor1 + valor2));
                    System.out.println(" ");
                }

            }
        }
    }

    public static class Emisferio {
        protected Planeta planeta;
        protected int a;
        protected int b;
        public void verificarEmisferio(ArrayList<Planeta> planetas){
            System.out.println("---------------------EMISFERIO---------------------");
            for(int i = 0; i<planetas.size(); i++){
                if( planetas.get(i).pontoY() > 8){
                    a += 1;
                }else if(planetas.get(i).pontoY() < 8){
                    b += 1;
                }
            }
            System.out.println("Numero de planetas no Norte é igual a: " + a);
            System.out.println("Numero de planetas no Sul é igual a: " + b);
        }
    }
}
