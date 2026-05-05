package org.example.model;

public class Coke extends ProductForSale{

    private boolean isZeroSugar;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, boolean isZeroSugar) {
        super(type, price, description);
        this.isZeroSugar = isZeroSugar;
    }

    public boolean isZeroSugar() {
        return isZeroSugar;
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName());
        System.out.println(super.toString() + " " +  this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "isZeroSugar=" + isZeroSugar +
                '}';
    }
}
