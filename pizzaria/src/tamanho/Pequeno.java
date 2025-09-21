package tamanho;

public class Pequeno implements Tamanho {
    @Override
    public String getDescricao() {
        return "Pequeno";
    }

    @Override
    public double getMultiplicador() {
        return 0.8;
    }
}