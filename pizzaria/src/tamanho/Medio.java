package tamanho;

public class Medio implements Tamanho {
    @Override
    public String getDescricao() {
        return "Médio";
    }

    @Override
    public double getMultiplicador() {
        return 1.0;
    }
}