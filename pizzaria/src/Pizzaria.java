import sabor.Calabresa;
import sabor.Margherita;
import sabor.Mussarela;
import sabor.Sabor;
import tamanho.Pequeno;
import tamanho.Medio;
import tamanho.Grande;
import tamanho.Tamanho;
import pizza.Pizza;
import pizza.PizzaTradicional;
import pizza.PizzaPremium;

public class Pizzaria {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE PEDIDOS DE PIZZA ===\n");

        // Criando sabores
        Sabor calabresa = new Calabresa();
        Sabor margherita = new Margherita();
        Sabor mussarela = new Mussarela();

        // Criando tamanhos
        Tamanho pequeno = new Pequeno();
        Tamanho medio = new Medio();
        Tamanho grande = new Grande();

        // Criando pizzas com diferentes combinações
        System.out.println("Pizzas Tradicionais:");
        Pizza pizza1 = new PizzaTradicional(calabresa, medio);
        pizza1.preparar();
        pizza1.descrever();
        System.out.println();

        Pizza pizza2 = new PizzaTradicional(margherita, grande);
        pizza2.preparar();
        pizza2.descrever();
        System.out.println();

        System.out.println("Pizzas Premium:");
        Pizza pizza3 = new PizzaPremium(mussarela, pequeno);
        pizza3.preparar();
        pizza3.descrever();
        System.out.println();

        Pizza pizza4 = new PizzaPremium(calabresa, grande);
        pizza4.preparar();
        pizza4.descrever();
        System.out.println();

        // Demonstrando flexibilidade do Bridge
        System.out.println("=== COMBINAÇÕES VARIADAS ===");
        Pizza[] pedidos = {
            new PizzaTradicional(calabresa, pequeno),
            new PizzaTradicional(margherita, medio),
            new PizzaPremium(mussarela, grande),
            new PizzaTradicional(mussarela, pequeno)
        };

        for (Pizza pizza : pedidos) {
            pizza.descrever();
        }
    }
}