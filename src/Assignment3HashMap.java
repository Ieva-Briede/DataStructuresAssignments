import java.util.*;

public class Assignment3HashMap {

    public static void main(String[] args) {
        HashMap<String, Double> productPrices = new HashMap<String, Double>();
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
        System.out.println();

        productsLessThanEur(productPrices);

        System.out.println();

        lowestPrice(productPrices);
        highestPrice(productPrices);

        System.out.println();

        HashMap<String, Double> newProducts = new HashMap<String, Double>();
        newProducts.put("Bananas", 1.29);
        newProducts.put("Potatoes", 0.40);
        newProducts.put("Yoghurt", 1.35);
        newProducts.put("Cake", 5.00);

        productPrices.putAll(newProducts);
        System.out.println("New list of product prices: " + productPrices);

//        counter = 0;
//        for (Map.Entry pp : productPrices.entrySet()) {
//            counter++;
//        }
//        System.out.println("Now there are " + counter + " products in the list");

        int size = productPrices.size();

        System.out.println("Now there are " + size + " products in the list \n");

        sortedByKey(productPrices);

        System.out.println();

        sortedByValue(productPrices);

    }

    public static void productsLessThanEur(HashMap<String, Double> products) {
        System.out.println("Products that cost less than 1 EUR");
        int counter = 0;
        for (Map.Entry<String, Double> price : products.entrySet()) {
            if (price.getValue() < 1.00) {
                System.out.println(price.getKey() + " " + price.getValue());
                counter++;
            }
        }
        System.out.println("There are " + counter + " products in total which cost less than 1 EUR");
    }

    public static void lowestPrice(HashMap<String, Double> products) {
        System.out.println("Product with the lowest price: ");
        double lowestPrice = (Collections.min(products.values()));
        for (Map.Entry<String, Double> price : products.entrySet()) {
            if (price.getValue() == lowestPrice) {
                System.out.println(price.getKey() + " " + price.getValue());
            }
        }
    }

    public static void highestPrice(HashMap<String, Double> products) {
        System.out.println("Product with the largest price: ");
        double largestPrice = (Collections.max(products.values()));
        for (Map.Entry<String, Double> price : products.entrySet()) {
            if (price.getValue() == largestPrice) {
                System.out.println(price.getKey() + " " + price.getValue());
            }

        }
    }

    public static void sortedByKey(HashMap<String, Double> products) {
        Map<String, Double> sortedList = new TreeMap<>(products);
        System.out.println("Sorted list by key: ");
        for (Map.Entry values : sortedList.entrySet()) {
            System.out.println(values.getKey() + " " + values.getValue());
        }
    }

    public static void sortedByValue(HashMap<String, Double> products) {
        System.out.println("Sorted list by value (from the cheapest to most expensive: ");
        Map<String, Double> result = new LinkedHashMap();
        products.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
        System.out.println(result);
    }
}
