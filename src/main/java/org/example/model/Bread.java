package org.example.model;

public class Bread extends ProductForSale{

    private boolean isWholeWheat;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    public Bread(String type, int price, String description, boolean isWholeWheat) {
        super(type, price, description);
        this.isWholeWheat = isWholeWheat;
    }

    public boolean isWholeWheat() {
        return isWholeWheat;
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName());
        System.out.println(super.toString() + " " +  this);
    }

    @Override
    public String toString() {
        return "Bread {" +
                "isWholeWheat= " + isWholeWheat +
                '}';
    }
}
