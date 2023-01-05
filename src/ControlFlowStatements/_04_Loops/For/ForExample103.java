package ControlFlowStatements._04_Loops.For;

// Java program to illustrate for loop.
public class ForExample103 {
    public static void main(String args[])
    {
        int sum = 0;

        // for loop begins
        // and runs till x <= 20
        for (int x = 1; x <= 20; x++) {
            sum = sum + x;
        }
        System.out.println("Sum: " + sum);
    }
}