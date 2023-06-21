package entities;

public class ProdutoImportado extends Produto {
    private Double taxa;

    public ProdutoImportado(String nome, Double preco, Double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public final Double precoTotal() {
        return getPreco() + taxa;
    }

    @Override
    public String etiquetaPreco() {
        return getNome() + " R$ " + precoTotal() + " (Taxa R$ " + getTaxa() + ")";
    }
}