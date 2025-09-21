# Projeto Pizza com Padrão Bridge (GoF)

Este projeto demonstra a implementação do padrão de projeto **Bridge** do Gang of Four (GoF) em um sistema de pizzaria.

## Sobre o Projeto

O sistema permite criar pizzas com diferentes combinações de:
- **Sabores**: Calabresa, Margherita, Mussarela
- **Tamanhos**: Pequeno, Médio, Grande
- **Categorias**: Tradicional, Premium

## Padrão Bridge

O padrão Bridge foi utilizado para separar a abstração (Pizza) de suas implementações (Sabor e Tamanho), permitindo que ambas variem independentemente.

### Estrutura:
- **Abstraction**: `Pizza`
- **Refined Abstractions**: `PizzaTradicional`, `PizzaPremium`
- **Implementor**: `Sabor`, `Tamanho`
- **Concrete Implementations**: `Calabresa`, `Margherita`, `QuatroQueijos`, `Pequeno`, `Medio`, `Grande`

## Como Executar

### Compilação:
```bash
javac -d bin src/sabor/*.java src/tamanho/*.java src/pizza/*.java src/Pizzaria.java