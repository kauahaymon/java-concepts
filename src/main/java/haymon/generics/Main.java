package haymon.generics;

import haymon.generics.heritage.IntBox;
import haymon.generics.heritage.NumberBox;
import haymon.generics.method.ListUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.save("Bola");

        Box<Integer> integerBox = new Box<>();
        integerBox.save(2);

        // Heritage
        IntBox intBox = new IntBox();
        intBox.save(3);

        NumberBox<Double> numberBox = new NumberBox<>();
        numberBox.save(4.4);

        // Method
        var days = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        var numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<String> stringList = new ArrayList<>(days);
        List<Integer> integerList = new ArrayList<>(numbers);

        String lastString = ListUtils.getLast(stringList);
        Integer lastInteger = ListUtils.getLast(integerList);

        System.out.println(lastInteger);
    }
}
