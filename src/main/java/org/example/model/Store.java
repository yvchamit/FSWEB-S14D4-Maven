package org.example.model;

public class Store {
    public static void main(String[] args) {

        //listProducts();

        ProductForSale[] products = new ProductForSale[5];
        products[0]= new Chocolate("Chocalate", 5, "Dark Chocolate", 120);
        products[1]= new Bread("Bakery", 3, "Mediterranean Bread", true);
        products[2]= new Coke("Siyah", 3,"Cola Turka", false);
        products[3]= new Coke("Sari", 3,"Uludag Gazoz", true);
        products[4]= new Chocolate("Chocolate", 5,"Milk Chocolate",100);

        listProducts(products);
    }

    public static void stars(){
        System.out.println("<---------------- ********* ---------------->");
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            if(product != null){
                product.showDetails();
            }
        }

    }
}