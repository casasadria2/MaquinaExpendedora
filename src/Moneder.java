import java.util.ArrayList;
import java.util.HashMap;

public class Moneder {
    //Atributs
    private final int numCaixes = 4;
    private ArrayList<Monedes> cM1E;
    private ArrayList<Monedes> cM2E;
    private ArrayList<Monedes> cM50C;
    private ArrayList<Monedes> cM20C;

    //Constructor
    public Moneder(ArrayList<Monedes> caixaM1E, ArrayList<Monedes> caixaM2E, ArrayList<Monedes> caixaM50C, ArrayList<Monedes> caixaM20C){
        this.cM1E = caixaM1E;
        this.cM2E = caixaM2E;
        this.cM20C = caixaM20C;
        this.cM50C = caixaM50C;
    }

    //Metodes

        /*
        Aquest metode et permet afegir la quantitat que vulguis a la caixa que vulguis.
         */
        public void afegirMonedesCaixa(int quantitat, String nomCaixa){
            for (int i =0; i < numCaixes; i++){
                switch (nomCaixa) {
                    case "cM1E":
                        for (int j = 0; j < quantitat; j++) {
                            cM1E.add(Monedes.E1);
                        }
                        break;
                    case "cM2E":
                        for (int j = 0; j < quantitat; j++) {
                            cM1E.add(Monedes.E2);
                        }
                        break;
                    case "cM50C":
                        for (int j = 0; j < quantitat; j++) {
                            cM1E.add(Monedes.C50);
                        }
                        break;
                    case "cM20C":
                        for (int j = 0; j < quantitat; j++) {
                            cM1E.add(Monedes.C20);
                        }
                        break;
                }
            }
        }


}
