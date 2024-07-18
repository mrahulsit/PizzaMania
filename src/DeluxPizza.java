public class DeluxPizza extends Pizza {
    public DeluxPizza(String name, int basePrice) {
        super(name, basePrice);
        addExtraCheese();
        addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        // Delux pizza already includes extra cheese
    }

    @Override
    public void addExtraToppings() {
        // Delux pizza already includes extra toppings
    }
}
