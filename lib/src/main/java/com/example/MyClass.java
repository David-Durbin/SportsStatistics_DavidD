package com.example;

public class MyClass
{
    public static void main(String[] args)
    {
        double[] pointsScored = {4.2, 0.2, 6.6, 1.2, 1.1, 6.5, 2.8, 2.2,
                3.3, 0.6, 3.1,7.3, 4.1, 2.2};
        double[] threePointerRebounds = {11.8, 3.9, 2.0}; // Pau Gasol, Mike Dunleavy, Aaron Brooks

        double avgRebounds = 0.0;
        double avgPointsScored = 0.0;
        double temp = 0.0;

        for(int i = 0; i < pointsScored.length; i++)
        {
            temp += pointsScored[i];
        }

        avgPointsScored = temp / pointsScored.length;

        System.out.println("The average number of points scored by the Chicago Bulls is: " +
                Math.round(100 * avgPointsScored) / 100d);

        for(int c = 0; c < threePointerRebounds.length; c++)
        {
            temp += threePointerRebounds[c];
        }

        avgRebounds = temp / threePointerRebounds.length;

        System.out.println("The average number of rebounds from the top three percent \n" +
        "of three-point scoring players is: " + Math.round(100 * avgRebounds) / 100d);

        System.out.println("\nAs for who is better, Derek Rose or Jimmy Butler...");
        System.out.println("\nNeither, neither one is any better than anyone else on their team(s).");
        System.out.println("And both are equally irrelevant.");
    }
}
