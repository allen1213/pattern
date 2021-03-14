package com.example.test;

@FunctionalInterface
public interface Converter<T,E> {
    E convert(T e);
}
