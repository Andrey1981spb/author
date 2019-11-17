package ru.spb.andrey.util;

import java.util.List;

public class ValidationUtil {

    public static boolean isValid(List<Integer> list, int number) {
        return list.stream().anyMatch(i -> i == number);
    }
}
