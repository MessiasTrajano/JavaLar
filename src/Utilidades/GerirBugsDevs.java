package Utilidades;
import Sistema.Planeta;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GerirBugsDevs {

    protected Scanner tecla = new Scanner(System.in);
    protected ArrayList<Integer> coordsX = new ArrayList<>();
    protected ArrayList<Integer> coordsY = new ArrayList<>();
    protected ArrayList<BugsDevs> bugsDevs = new ArrayList<>();
    protected ArrayList<BugsDevs> listabugs = new ArrayList<>();
    protected ArrayList<BugsDevs> listadevs = new ArrayList<>();

    protected Random Cord = new Random();

    public void criar(ArrayList<Planeta> planetas){
        criarBugs(planetas);
        criarDevs(planetas);
    }

    public void criarBugs(ArrayList<Planeta> planetas){

        System.out.println("Digite quantos bugs deseja criar:");
        int a = tecla.nextInt();
        criarY(a);
        criarX(a);
        conferir(planetas);

        for(int i = 0; i<a; i++){
            BugsDevs bugs = new BugsDevs("Bug", coordsX.get(i), coordsY.get(i));
            bugsDevs.add(bugs);
            listabugs.add(bugs);
        }
        coordsX.clear();
        coordsY.clear();


    }
    public void criarDevs(ArrayList<Planeta> planetas){
        System.out.println("Digite quantos devs deseja criar:");
        int a = tecla.nextInt();
        criarY(a);
        criarX(a);
        conferir(planetas);
        for(int i = 0; i<a; i++){
            BugsDevs devs = new BugsDevs("Dev", coordsX.get(i), coordsY.get(i));
            bugsDevs.add(devs);
            listadevs.add(devs);
        }
        coordsX.clear();
        coordsY.clear();
    }
    public void conferir(ArrayList<Planeta> planetas){
        for(int i = 0; i < planetas.size(); i++){
            for(int p = 0; p < coordsX.size(); p++){

                if(planetas.get(i).pontoX() == coordsX.get(p) && planetas.get(i).pontoY() == coordsY.get(p)){
                    coordsX.set(p, 1 + Cord.nextInt(15));
                    conferir(planetas);

                } else if (coordsX.get(p) == 8 && 8 == coordsY.get(p) ) {
                    coordsY.set(p, 1 + Cord.nextInt(15));
                    conferir(planetas);
                }
            }
        }

    }
    public void imprimir(){
        System.out.println("---------------------BugsDevs---------------------");
        for( int i =0; i<bugsDevs.size(); i++){
            System.out.println("A posição do " + bugsDevs.get(i).getNome() + " É: " + bugsDevs.get(i).locX() + "X" + " - " + bugsDevs.get(i).locY()+ "Y");
        }
    }
    public void criarX(int quantidade){
        int coordenada;
        for(int i = 0; i<quantidade; i++) {
            coordenada = 1 + Cord.nextInt(15);
            if (coordsX.contains(coordenada)) {
                criarX(1);
            }else{
                coordsX.add(coordenada);
            }
        }
    }
    public void criarY(int quantidade){
        int coordenada;
        for(int i = 0; i<quantidade; i++) {
            coordenada = 1 + Cord.nextInt(15);
            if (coordsY.contains(coordenada)) {
                criarY(1);
            }else{
                coordsY.add(coordenada);
            }
        }
    }
    public void verificar(ArrayList<Planeta> planetas){
        System.out.println("---------------------Planetas atingidos---------------------");
        verificarbugs(planetas);
        verificardevs(planetas);
    }
    public void verificarbugs(ArrayList<Planeta> planetas) {

        for (int i = 0; i < planetas.size(); i++) {
            for (int p = 0; p < listabugs.size(); p++) {

                if (planetas.get(i).pontoX() == listabugs.get(p).locX() && planetas.get(i).pontoY() == listabugs.get(p).locY()) {
                    planetas.get(i).setUnidade(-1);
                    System.out.println(planetas.get(i).getNome() + " foi atingido por um bug.");
                }
            }
        }

    }
    public void verificardevs(ArrayList<Planeta> planetas) {
        for (int i = 0; i < planetas.size(); i++) {
            for (int p = 0; p < listadevs.size(); p++) {

                if (planetas.get(i).pontoX() == listadevs.get(p).locX() && planetas.get(i).pontoY() == listadevs.get(p).locY()) {
                    planetas.get(i).setUnidade(-1);
                    System.out.println(planetas.get(i).getNome() + " foi atingido por um dev.");

                }
            }
        }
    }

}
