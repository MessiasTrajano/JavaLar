package Contas;

import Sistema.Planeta;

import java.util.ArrayList;

public class DiasAnos extends Calc{

    public void DiaseAnos(ArrayList<Planeta> p, int instantes){
        Dias(p, instantes);
        Anos(p,instantes);
    }

    public void Dias(ArrayList<Planeta> p, int instantes){
        System.out.println("---------------------DIAS---------------------");
        for(int i = 0; i<p.size(); i++){

            double valor = (p.get(i).getHoras() * instantes);
            System.out.printf("Dias passados em " +  p.get(i).getNome() + " = " + "%.2f",(valor));
            System.out.println("H");
        }
    }

    public void Anos(ArrayList<Planeta> p, int instantes){
        System.out.println("---------------------ANOS---------------------");

        for(int i = 0; i < p.size(); i++){
            double valor = ((p.get(i).getUnidade()* instantes )/ p.get(i).getMovimentoTotal());

            System.out.printf("Anos passados em " + p.get(i).getNome() + " = " + "%.2f",valor);

            System.out.println(" ");
        }
    }
}
