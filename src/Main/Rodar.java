package Main;

import Contas.*;
import Sistema.Planeta;
import Utilidades.GerirBugsDevs;
import Utilidades.Impressao;

import java.util.ArrayList;
import java.util.Scanner;

public class Rodar {

    protected Calc calc;
    protected DiasAnos diasAnos = new DiasAnos();
    protected Area area = new Area();
    protected DistEuclidiana.Emisferio emisferio = new DistEuclidiana.Emisferio();
    protected DistEuclidiana euclidiana = new DistEuclidiana();
    protected Scanner tecla = new Scanner (System.in);
    protected GerirBugsDevs criarBD = new GerirBugsDevs();

    protected ArrayList<Planeta> planetas = new ArrayList<>();
    protected int instantesTotais;

    public void rodar(int instante){
        criarBD.criar(planetas);
        for( int i =0; i<instante; i++){
            chamarMovimento(planetas);
        }
        relatorioMovimento(planetas);
        criarBD.imprimir();
        criarBD.verificar(planetas);
        area.calcArea(planetas);
        RotTransla RT = new RotTransla(planetas, instante);
        emisferio.verificarEmisferio(planetas);
        euclidiana.calcEuclidiana(planetas);
        diasAnos.DiaseAnos(planetas, instante);
        menu2();

    }

    private void relatorioMovimento(ArrayList<Planeta> p) {
        System.out.println("---------------------MOVIMENTO---------------------");

        for (int i = 0; i < p.size(); i++) {
            System.out.println("A posição do planeta " + p.get(i).getNome() + " É: " + p.get(i).pontoX() + "X" + " - " + p.get(i).pontoY() + "Y");
        }
    }

    public void chamarMovimento(ArrayList<Planeta> p) {
        
        for (int i = 0; i < p.size(); i++) {
            p.get(i).movimento();
        }
    }
    public void menu() {
        planetas = calc.adicionarPlanetas();
        System.out.printf("Deseja ultilizar o JavaLar?(S/N)");
        String decisao = tecla.next();

        if(decisao.equals("S")) {
            System.out.println(" ");
            System.out.printf("Digite quantos instantes vc deseja:");
            int instantes = tecla.nextInt();
            instantesTotais = instantes;
            rodar(instantes);

        }else if(decisao.equals("N")){
            System.exit(1);

        }else{
            menu();
        }


    }

    public void menu2() {
        System.out.printf("Deseja ultilizar novamente o JavaLar?(S/N)");
        String decisao = tecla.next();

        if(decisao.equals("S")) {
            System.out.println(" ");
            System.out.printf("Digite quantos instantes vc deseja:");
            int instantes = tecla.nextInt();
            instantesTotais= instantesTotais + instantes;
            rodar(instantes);

        }else if(decisao.equals("N")){
            System.out.println("---------------------ResumoFinal---------------------");
            System.out.println(" ");
            relatorioMovimento(planetas);
            criarBD.imprimir();
            criarBD.verificar(planetas);
            emisferio.verificarEmisferio(planetas);
            euclidiana.calcEuclidiana(planetas);
            diasAnos.DiaseAnos(planetas, instantesTotais);
            Impressao imp = new Impressao();

        }else{
            menu2();
        }


    }

}
