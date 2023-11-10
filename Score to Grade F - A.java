package javaFundamentals;

import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[]args) {

        Scanner s = new Scanner(System.in);


        System.out.print(" Prog1     :");
        float prog1Grade = s. nextFloat();

        System.out.print(" Prog2  :");
        float prog2Grade = s. nextFloat();

        System.out.print("Prog3 :");
        float englishGrade = s. nextFloat();

        System.out.print("Prog4  :");
        float ComputerGrade = s. nextFloat();

        float score =(prog1Grade + prog2Grade + englishGrade + ComputerGrade ) /4;

        System.out.println();
        System.out.println("Score :" + score);

        if( score >=90) System.out.println("A Grade");
        else if (score >= 80)System.out.println("B Grade");
        else if (score  >= 70)System.out.println("C Grade");
        else if (score >= 60)System.out.println("D Grade");
        else if (score >= 59)System.out.println("F Grade");
        else System.out.println("Better Luck Next Time!");





        


    }

}
