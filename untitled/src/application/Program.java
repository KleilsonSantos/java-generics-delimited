package application;

import service.ProductRead;

public class Program {
    public static void main(String[] args) throws RuntimeException {
        String path = "products.txt";
        ProductRead productRead = new ProductRead();
        productRead.getLists(path);
    }
}