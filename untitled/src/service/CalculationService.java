package service;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CalculationService {
    public static Integer max(List<Integer> integerList) {
        if(integerList.isEmpty())throw new IllegalStateException("List can't be empty");
        var max = integerList.get(0);
        for (var integer: integerList) if (integer.compareTo(max) > 0)max = integer;
        return max;
    }
}