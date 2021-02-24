import java.util.*;

public class Assignment3HashTable {

    public static void main(String[] args) {
        Hashtable<String, Double> productPrices = new Hashtable<>();
        productPrices.put("Eggs", 1.95);
        productPrices.put("Apples", 0.90);
        productPrices.put("Oranges", 1.35);
        productPrices.put("Bread", 1.50);
        productPrices.put("Carrots", 0.35);
        productPrices.put("Milk", 1.60);
        productPrices.put("Breakfast Cornflakes", 2.50);
        productPrices.put("Butter", 2.00);

        System.out.println("Product prices:");
        for (Map.Entry pp : productPrices.entrySet()) {
            System.out.println(pp.getKey() + " " + pp.getValue());
        }

        System.out.println("Products that cost less than 1 EUR");
        int counter = 0;
        for (Map.Entry<String, Double> price : productPrices.entrySet()){
            if (price.getValue() < 1.00) {
                System.out.println(price.getKey() + " " + price.getValue());
                counter++;
            }
        } System.out.println("There are " + counter + " products in total which cost less than 1 EUR");


        System.out.println("Product with the lowest price: ");
        double lowestPrice = (Collections.min(productPrices.values()));
        for (Map.Entry<String, Double> price : productPrices.entrySet()) {
            if (price.getValue() == lowestPrice) {
                System.out.println(price.getKey() + " " + price.getValue());
            }
        }


        System.out.println("Product with the largest price: ");
        double largestPrice = (Collections.max(productPrices.values()));
        for (Map.Entry<String, Double> price : productPrices.entrySet()) {
            if (price.getValue() == largestPrice) {
                System.out.println(price.getKey() + " " + price.getValue());
            }

        }

        HashMap<String, Double> newProducts = new HashMap<String, Double>();
        newProducts.put("Bananas", 1.29);
        newProducts.put("Potatoes", 0.40);
        newProducts.put("Yoghurt", 1.35);
        newProducts.put("Cake", 5.00);

        productPrices.putAll(newProducts);
        System.out.println(productPrices);

        System.out.println("New list of product prices:");
        counter = 0;
        for (Map.Entry pp : productPrices.entrySet()) {
            System.out.println(pp.getKey() + " " + pp.getValue());
            counter++;
        }
        System.out.println("Now there are " + counter + " products in the list");

        int size = productPrices.size();
        System.out.println(size);


        Map<String, Double> sortedList = new TreeMap<>(productPrices);
        System.out.println("Sorted list: ");
        for (Map.Entry values: sortedList.entrySet()){
            System.out.println(values.getKey() + " " + values.getValue());
        }

    }
}

