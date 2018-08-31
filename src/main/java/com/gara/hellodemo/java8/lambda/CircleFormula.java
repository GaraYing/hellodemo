package com.gara.hellodemo.java8.lambda;

/**
 * @description: TODO
 * @author: GaraYing
 * @create: 2018-08-31 10:07
 **/

public class CircleFormula implements Formula {
    @Override
    public double calculate(double r) {
        return Math.pow(r, 2);
    }

    @Override
    public double test() {
        return 0;
    }

    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(double r) {
                return sqrt(r*100);
            }

            @Override
            public double test() {
                return 0;
            }
        };

        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(10000));
    }
}
