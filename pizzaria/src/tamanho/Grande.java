package tamanho;

public class Grande implements Tamanho {
    @Override
    public String getDescricao() {
        return "Grande";
    }

    @Override
    public double getMultiplicador() {
        return 1.2;
    }
}