
public class Producte {
    private String  nom;
    private float preu;
    private int quantitat;
    private String idProducte;

    public Producte(String nom, float preu, int quantitat, String idProducte) {
        this.nom = nom;
        this.preu = preu;
        this.quantitat = quantitat;
        this.idProducte = idProducte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public String getIdProducte() {
        return idProducte;
    }

    public void setIdProducte(String idProducte) {
        this.idProducte = idProducte;
    }
    
}
