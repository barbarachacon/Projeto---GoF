package pizza;

import sabor.Sabor;
import tamanho.Tamanho;

public class PizzaPremium extends Pizza {
    private static final double TAXA_PREMIUM = 1.5;

    public PizzaPremium(Sabor sabor, Tamanho tamanho) {
        super(sabor, tamanho);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza premium...");
        System.out.println("Massa especial, molho artesanal, ingredientes selecionados");
    }

    @Override
    public double calcularPreco() {
        return sabor.getPrecoBase() * tamanho.getMultiplicador() * TAXA_PREMIUM;
    }

    @Override
    public void descrever() {
        System.out.println("Pizza Premium " + sabor.getDescricao() + 
                          " - Tamanho: " + tamanho.getDescricao() +
                          " - Preço: R$" + String.format("%.2f", calcularPreco()));
    }
}
