package application;

import entitie.Product;
import service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Program {

    public static void main(String[] args) throws RuntimeException {

        List<Product> productList = new ArrayList<>();
        var path = "products.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            String[] vect;
            while (line != null){
                vect = line.split(",");
                productList.add(new Product(vect[0],Double.parseDouble(vect[1])));
                line = bufferedReader.readLine();
            }
            Collections.sort(productList);
            var max = CalculationService.max(productList);
            //System.out.println(productList);
            System.out.println("Most expensive: -> " + max);
        } catch (IOException | IndexOutOfBoundsException e) {
            throw new RuntimeException("Error -> " + e.getMessage());
        }
    }
}