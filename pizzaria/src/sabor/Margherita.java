package sabor;

public class Margherita implements Sabor {
    @Override
    public String getDescricao() {
        return "Margherita";
    }

    @Override
    public double getPrecoBase() {
        return 30.00;
    }
}
