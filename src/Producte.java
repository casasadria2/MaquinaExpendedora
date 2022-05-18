
public class Producte {
    private String  nom;
    private float preu;
    private float quantitat;
    private String idProducte;


    public Producte(String nom, float preu, int quantitat, String idProducte) {
        this.nom = nom;
        this.preu = preu;
        this.quantitat = quantitat;
        this.idProducte = idProducte;
    }

    public java.lang.String getNom() {
        return nom;
    }

    public float getPreu() {
        return preu;
    }

    public float getQuantitat() {
        return quantitat;
    }

    public String getIdProducte() {
        return idProducte;
    }
}