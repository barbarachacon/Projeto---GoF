package pizza;

import sabor.Sabor;
import tamanho.Tamanho;

public abstract class Pizza {
    protected Sabor sabor;
    protected Tamanho tamanho;

    public Pizza(Sabor sabor, Tamanho tamanho) {
        this.sabor = sabor;
        this.tamanho = tamanho;
    }

    public abstract void preparar();
    public abstract double calcularPreco();
    public abstract void descrever();
}
