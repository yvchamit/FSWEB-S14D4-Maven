package org.example.model;

public class Chocolate extends ProductForSale{

    private int calorie;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, int price, String description, int calorie) {
        super(type, price, description);
        this.calorie = calorie;
    }

    public int getCalorie() {
        return calorie;
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName());
        System.out.println(super.toString() + " " +  this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "calorie=" + calorie +
                '}';
    }
}
