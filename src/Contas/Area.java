package Contas;

import Sistema.Planeta;

import java.util.ArrayList;

public class Area extends Calc {

    public void calcArea(ArrayList<Planeta> p1){
        System.out.println("---------------------AREA---------------------");


        for(int i = 0; i< p1.size(); i++){
            for(int a = 0; a< p1.size(); a++){
                planeta = p1.get(i);
                planeta2 = p1.get(a);
                if (p1.get(i).pontoX() - p1.get(a).pontoX() == 0 && p1.get(i).pontoY() - p1.get(a).pontoY() == 0 ){
                    continue;
                }else{
                    int valor1 = 1 + Math.abs(p1.get(i).pontoX() - p1.get(a).pontoX());
                    int valor2 = 1 + Math.abs(p1.get(i).pontoY() - p1.get(a).pontoY());

                    System.out.println("Area do " + p1.get(i).getNome() + " com " + p1.get(a).getNome() + " é: " + valor1*valor2);
                }

            }
        }
    }
}
