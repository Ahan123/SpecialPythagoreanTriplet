package com.ahanmalli;

public class Main {

    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 1;
        boolean equation = true;

        while (equation == true) {
            int problem = firstNumber * firstNumber + secondNumber * secondNumber;
            double thing = Math.sqrt(problem);

            if (secondNumber > firstNumber) {

                if (thing > secondNumber) {

                    if (firstNumber + secondNumber + thing == 1000) {
                        System.out.println(firstNumber + " + " + secondNumber + " + " + thing);
                        System.out.println(firstNumber * secondNumber * thing);
                        equation = false;
                    }
                }
            }

            if (firstNumber == 1000) {
                firstNumber = 1;
                secondNumber++;

            } else {
                firstNumber++;
            }
        }
    }
}
