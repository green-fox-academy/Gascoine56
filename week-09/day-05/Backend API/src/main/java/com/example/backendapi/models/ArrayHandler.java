package com.example.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
public class ArrayHandler {

    private String what;
    private int[] numbers;

    public ArrayHandler(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public int sum() {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public int multiply() {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }

    public int[] doubleArray() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }

    @Override
    public String toString() {
        return "ArrayHandler{" +
                "what='" + what + '\'' +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }
}