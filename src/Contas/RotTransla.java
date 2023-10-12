package Contas;

import Sistema.Planeta;

import java.util.ArrayList;

public class RotTransla {

    public RotTransla(ArrayList<Planeta> p, int instantes){
        rotacao(p,instantes);
        translacao(p,instantes);
    }
    public void rotacao(ArrayList<Planeta> p, int instantes){
        System.out.println("---------------------ROTACAO---------------------");
        for(int i = 0; i<p.size(); i++){

            int valor = (p.get(i).getUnidade() * instantes);
            System.out.println("Rotaçao em " +  p.get(i).getNome() + " = " + valor);

        }
    }
    public void translacao(ArrayList<Planeta> p, int instantes){
        System.out.println("---------------------TRANSLACAO---------------------");
        for(int i = 0; i<p.size(); i++){

            int valor = (p.get(i).getUnidade() * instantes);
            System.out.println("Translacao em " +  p.get(i).getNome() + " = " + valor);

        }
    }
}
