package pizza;

import sabor.Sabor;
import tamanho.Tamanho;

public class PizzaTradicional extends Pizza {
    public PizzaTradicional(Sabor sabor, Tamanho tamanho) {
        super(sabor, tamanho);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza tradicional...");
        System.out.println("Massa tradicional, molho de tomate");
    }

    @Override
    public double calcularPreco() {
        return sabor.getPrecoBase() * tamanho.getMultiplicador();
    }

    @Override
    public void descrever() {
        System.out.println("Pizza " + sabor.getDescricao() + 
                          " - Tamanho: " + tamanho.getDescricao() +
                          " - Preço: R$" + String.format("%.2f", calcularPreco()));
    }
}
