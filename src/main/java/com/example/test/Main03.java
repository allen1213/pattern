package com.example.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Main03 {

    public static void main(String[] args) {




    }

    private static void test04() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("筛选列表: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);
    }

    private static void test03() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数
        List<Integer> squaresList = numbers.stream()
                .map( i -> i*i)
                .distinct()
                .collect(Collectors.toList());
        squaresList.forEach(System.out::print);
    }

    private static void test02() {
        Random random = new Random();
        random.ints()
                .limit(10)
                .forEach(i -> System.out.println(i + " "));
    }

    private static void test01() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        Optional<String> reduce = strings.stream()
                .filter(s -> !s.isEmpty())
                .reduce((a, b) -> a + " " + b);
        reduce.ifPresent(System.out::print);

        List<String> collect = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        collect.forEach(s -> System.out.print(" " + s));
    }
}
