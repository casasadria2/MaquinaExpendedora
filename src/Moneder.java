import java.util.ArrayList;
import java.util.HashMap;

public class Moneder {
    //Atributs
    private final int numCaixes = 4;
    private ArrayList<Moneda> cM1E;
    private ArrayList<Moneda> cM2E;
    private ArrayList<Moneda> cM50C;
    private ArrayList<Moneda> cM20C;

    //Constructor
    public Moneder(ArrayList<Moneda> caixaM1E, ArrayList<Moneda> caixaM2E, ArrayList<Moneda> caixaM50C, ArrayList<Moneda> caixaM20C){
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
                switch (nomCaixa) {
                    case "cM1E":
                        for (int j = 0; j < quantitat; j++) {
                            cM1E.add(Moneda.E1);
                        }
                        break;
                    case "cM2E":
                        for (int j = 0; j < quantitat; j++) {
                            cM2E.add(Moneda.E2);
                        }
                        break;
                    case "cM50C":
                        for (int j = 0; j < quantitat; j++) {
                            cM50C.add(Moneda.C50);
                        }
                        break;
                    case "cM20C":
                        for (int j = 0; j < quantitat; j++) {
                            cM20C.add(Moneda.C20);
                        }
                        break;
                }
        }

        public int contarMonedesCaixa(String nomCaixa){
            return switch (nomCaixa) {
                case "cM1E" -> cM1E.size();
                case "cM2E" -> cM2E.size();
                case "cM50C" -> cM50C.size();
                case "cM20C" -> cM20C.size();
                default -> 0;
            };
        }

        public HashMap<Moneda, Integer> canviARetorna(double canviARetorna){
           HashMap<Moneda, Integer> llistaMonedes = new HashMap<>();
           boolean canviDonat = false;
           boolean potTornarCanvi = true;
           Integer quantiat = 0;
           double canviRetornat = 0;


           while (potTornarCanvi){
               canviRetornat = canviRetornat + Moneda.E2.getValor();
               if (canviRetornat > canviARetorna){
                   canviRetornat = canviRetornat - Moneda.E2.getValor();
                   potTornarCanvi = false;
               }else if (canviRetornat == canviARetorna){
                   canviDonat = true;
               }else {
                   quantiat++;
               }
           }
           llistaMonedes.put(Moneda.E2, quantiat);

           if (!canviDonat){
               potTornarCanvi = true;
               quantiat = 0;
               while (potTornarCanvi){
                   canviRetornat = canviRetornat + Moneda.E1.getValor();
                   if (canviRetornat > canviARetorna){
                       canviRetornat = canviARetorna - Moneda.E1.getValor();
                       potTornarCanvi = false;
                   }else if (canviRetornat == canviARetorna){
                       canviDonat = true;
                   }else {
                       quantiat++;
                   }
               }
               llistaMonedes.put(Moneda.E1, quantiat);
           }

            if (!canviDonat){
                potTornarCanvi = true;
                quantiat = 0;
                while (potTornarCanvi){
                    canviRetornat = canviRetornat + Moneda.C50.getValor();
                    if (canviRetornat > canviARetorna){
                        canviRetornat = canviARetorna - Moneda.C50.getValor();
                        potTornarCanvi = false;
                    }else if (canviRetornat == canviARetorna){
                        canviDonat = true;
                    }else {
                        quantiat++;
                    }
                }
                llistaMonedes.put(Moneda.C50, quantiat);
            }

            if (!canviDonat){
                potTornarCanvi = true;
                quantiat = 0;
                while (potTornarCanvi){
                    canviRetornat = canviRetornat + Moneda.C20.getValor();
                    if (canviRetornat > canviARetorna){
                        canviRetornat = canviARetorna - Moneda.C20.getValor();
                        potTornarCanvi = false;
                    }else if (canviRetornat == canviARetorna){
                        canviDonat = true;
                    }else {
                        quantiat++;
                    }
                }
                llistaMonedes.put(Moneda.C20, quantiat);
            }

            if (!canviDonat){
                System.out.println("Error al tornar el canvi!!");
            }

           return llistaMonedes;
        }



}
