import java.util.ArrayList;

public class Moneder {
    //Atributs
    ArrayList<Monedes> moneder;
    float monaderActual;

    //Constructor
    public Moneder(ArrayList<Monedes> moneder, float monaderActual){
        this.moneder = moneder;
        this.monaderActual = monaderActual;
    }

    //Metodes
    public void afegirMonedes(Monedes monedes){
        moneder.add(monedes);
    }

    public void afegirQuantitatMonedes(String tipus, int quantiat){
        for (Monedes a : moneder){
            if (a.getTipus().equals(tipus)){
                a.afegirMonedes(quantiat);
                break;
            }
        }
    }

}
