package service;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CalculationService{
    public static <T extends Comparable<T>> T max(List<T> integerList) {
        if(integerList.isEmpty())throw new IllegalStateException("List can't be empty");
        T max = integerList.get(0);
        for (T integer: integerList) if (integer.compareTo(max) > 0)max = integer;
        return max;
    }


}