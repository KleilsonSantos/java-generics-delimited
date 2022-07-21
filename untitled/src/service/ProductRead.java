package service;

import entitie.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductRead {
    private static final List<Product> productList = new ArrayList<>();
    public void getLists(String path) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] vect = line.split(",");
                productList.add(new Product(vect[0], Double.parseDouble(vect[1])));
                line = bufferedReader.readLine();
            }
            productList.sort(Comparator.comparing(Product::getPrice));
            var product = productList.get(0);
            System.out.println("Most expensive product: -> " + product);
        } catch (IOException | IndexOutOfBoundsException e) {
            throw new RuntimeException("Error -> " + e.getMessage());
        }
    }
}
