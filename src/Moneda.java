public enum Moneda {
    E1(1),
    E2(2),
    C50(0.50),
    C20(0.20);
    private double valor;

    Moneda(double valor) {
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }
}