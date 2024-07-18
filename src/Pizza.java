public class Pizza {
    private String name;
    private int basePrice;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;

    private static final int EXTRA_CHEESE_PRICE = 100;
    private static final int EXTRA_TOPPINGS_PRICE = 150;
    private static final int TAKEAWAY_PRICE = 20;

    public Pizza(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getCheesePrice() {
        return EXTRA_CHEESE_PRICE;
    }

    public int getToppingPrice() {
        return EXTRA_TOPPINGS_PRICE;
    }

    public int getTakeawayPrice() {
        return TAKEAWAY_PRICE;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public void addExtraCheese() {
        this.extraCheese = true;
    }

    public boolean getExtraCheese() {
        return extraCheese;
    }

    public boolean getExtraToppings() {
        return extraToppings;
    }

    public void addExtraToppings() {
        this.extraToppings = true;
    }

    public boolean getTakeaway() {
        return takeAway;
    }

    public void addTakeAway() {
        this.takeAway = true;
    }

    public int calculateTotal() {
        int total = basePrice;
        if (extraCheese) {
            total += EXTRA_CHEESE_PRICE;
        }
        if (extraToppings) {
            total += EXTRA_TOPPINGS_PRICE;
        }
        if (takeAway) {
            total += TAKEAWAY_PRICE;
        }
        return total;
    }
}
