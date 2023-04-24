class Pizza {
    private String topping;
    private int radius;
    static int count;
    public Pizza(String topping) {
        this.topping = topping;
        count++;
    }
}

public class PizzaCount {
    public static void main(String [] args) {
        Pizza p1 = new Pizza("onion");
        Pizza p2 = new Pizza("pepperoni");
        Pizza p3 = new Pizza("cheese");
        Pizza p4 = new Pizza("potato");

        System.out.println(Pizza.count);
    }
}
