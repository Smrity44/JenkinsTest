package ControlFlowStatements._05_BreakContinue;

//Java Program to demonstrate the use of continue statement
//inside the Java do-while loop.
public class _6_ContinueDoWhileExample103 {
    public static void main(String[] args) {
//declaring variable
        int i=1;
//do-while loop
        do{
            if(i==5){
//using continue statement
                i++;
                continue;//it will skip the rest statement
            }
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}
