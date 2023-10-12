package Contas;

import Sistema.*;
import Sistema.Planetas.*;

import java.util.ArrayList;

public class Calc{
    protected Planeta planeta;
    protected Planeta planeta2;
    public static ArrayList<Planeta> adicionarPlanetas(){
        ArrayList<Planeta> plan = new ArrayList<>();
        plan.add(new Python());
        plan.add(new JavaScript());
        plan.add(new Ruby());
        plan.add(new Php());
        plan.add(new CS());
        plan.add(new CPP());
        plan.add(new C());

        return plan;

    }

}

