class Pizza {
    private int radius;

    public Pizza(int radius) {
        this.radius = radius;
    }

    public Pizza whoseLargest(Pizza p1, Pizza p2) {
        p1.radius = 50;
        return (p1.radius > p2.radius ? p1 : p2);
    }

    public int getRadius() {
        return radius;
    }
}

public class LargerPizza {
    public static void main(String [] args) {
        Pizza pizza1 = new Pizza(14);
        Pizza pizza2 = new Pizza(18);

        Pizza largerPizza = pizza1.whoseLargest(pizza1, pizza2);

        System.out.println(largerPizza.getRadius());
    }
}
