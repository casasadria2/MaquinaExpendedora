
public class Monedes {
    //Atributs
    private String tipus;
    private double valor;
    private int quantiat;

    //Constructor
    public Monedes(String tipus, double valor, int quantiat){
        this.tipus = tipus;
        this.valor = valor;
        this.quantiat = quantiat;
    }

    //Metodes
    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantiat() {
        return quantiat;
    }

    public void setQuantiat(int quantiat) {
        this.quantiat = quantiat;
    }

    public void afegirMonedes(int quantiat){
        this.quantiat = this.quantiat + quantiat;
    }
}
