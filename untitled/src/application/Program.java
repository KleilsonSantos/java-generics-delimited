package application;

import service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Program {

    public static void main(String[] args) throws RuntimeException {

        List<Integer> integerList = new ArrayList<>();
        var path = "numbers.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null){
                integerList.add(Integer.parseInt(line));
                line = bufferedReader.readLine();
            }
            Collections.sort(integerList);
            var max = CalculationService.max(integerList);
            System.out.println(integerList);
            System.out.println("Max number -> " + max);
        } catch (IOException | IndexOutOfBoundsException e) {
            throw new RuntimeException("Error -> " + e.getMessage());
        }
    }
}