package javaexercise._3;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        char[] nameAndSurnameInitials= {'A', 'D', 'M'};
        System.out.print(nameAndSurnameInitials[0]);
        System.out.print("," + nameAndSurnameInitials[1]);
        System.out.print("," + nameAndSurnameInitials[2]);


    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int age = 26;
        System.out.println(age);

        boolean haveLunch = true;
        System.out.println(haveLunch);

        double priceOfLunch = 4.99;
        System.out.println("The price of your lunch is " + priceOfLunch);
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 2:");

        int age = 26;
        System.out.println(age);

        boolean lunch = true;
        System.out.println(lunch);

        double price = 4.99;
        System.out.println("The price of your lunch is " + price);
    }
}

