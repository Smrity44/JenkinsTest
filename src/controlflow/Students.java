package controlflow;

public class Students {

    public static void main(String[] args) {
        Students students = new Students();
        //students.printHello();
        students.storeGrades();

    }

    public void storeGrades(){
        // Declare an array for storing grades
        char[] grades = new char[5];  // How many values inside this array at this point(Line 7)?

        // Lets insert value into the array index
        grades[0] = 'A';
        grades[1] = 'B';
        grades[2] = 'B';
        grades[3] = 'B';
        grades[4] = 'B';

        // Let's try to get value from the array

        //char valueAtIndex0 = grades[0];  // A

        System.out.println("valueAtIndex0 " + " " + grades[0]);
        System.out.println("valueAtIndex1 " + " " + grades[1] );
        System.out.println("valueAtIndex2 " + " " + grades[2] );
        System.out.println("valueAtIndex3 " + " " + grades[3] );
        System.out.println("valueAtIndex4 " + " " + grades[4] );

        // startValue = 0, stopValue = 4, incrementBy = 1
        int i;
        for(i = 0; i<=4; i++){
            System.out.println(grades[i]);
        }


    }

    public void printHello(){
        // Let's print Hello 10 times by using one line of statement

       /*
       * 1. From where to start - initial value 1
       * 2. How to go next step - increment - increment by 1
       * 3. Where to stop - final value
       *
       * */

        int startFrom;
        int stopAt = 10;

        // for (FromWhereToStart; WhereToStop; HowToGoNextStep)

        for(startFrom = 1; startFrom <= stopAt; startFrom++ ){

            System.out.println("Hello");

        }

        System.out.println("Hello");
    }

}
