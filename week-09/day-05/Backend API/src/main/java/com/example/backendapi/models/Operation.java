package com.example.backendapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Operation {

    private String operation;
    private int until;
    private int result = 0;

    public Operation(String operation, Until until) {
        this.operation = operation;
        this.until = until.getUntil();
        if (operation.equals("sum"))
            sum(this.until);
        else if (operation.equals("factor"))
            factorial(this.until);
    }

    public void sum(int until) {
        for (int i = 0; i <= until; i++) {
            this.result += i;
        }
    }

    public void factorial(int until) {
        this.result += 1;
        for (int i = 1; i <= until; i++) {
            this.result *= i;
        }
    }

    @Override
    public String toString() {
        return "Operation{" +
                "result=" + result +
                '}';
    }
}