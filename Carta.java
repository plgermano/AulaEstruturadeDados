public class Carta {
    public String naipe;
    private String valor;

    public Carta(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public String getValor() {
        return valor;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta [naipe=" + naipe + ", valor=" + valor + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        Carta c = (Carta) o;
        if (c.naipe.equals(this.naipe) && c.valor.equals(this.valor))
            return true;
        return false;
    }

}
// aula 22/03/2025