package com.example.test;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        //Supplier
    }

    private static void test06() {
        Arrays.asList("a","b","d").sort((a, b) -> a.compareTo(b));

        List<String> list = new ArrayList<>();
    }

    private static void test07() {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }

        map.forEach((key, val) -> System.out.println(key + " : " +val));
    }

    private static void test05() {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        stringCollection
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);

        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        Optional<String> reduced =
                stringCollection
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
        System.out.println(reduced.get());
    }

    private static void test04() {
        Optional<String> boer = Optional.of("boer");

        System.out.println(boer.toString());
        System.out.println(boer.orElse("allen"));
    }

    private static void test03() {
        //Comparator
        //Runnable
        Predicate<Boolean> noNull = Objects::isNull;
        System.out.println(noNull.test(false));
    }

    private static void test02() {
        Converter<String, Integer> converter = e -> Integer.valueOf(e);
        //OR
        //Converter<String, Integer> converter = Integer :: valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);
    }

    private static void test01() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}
