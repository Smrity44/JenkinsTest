public class Alexa {
  /**
   * Design - class - Blueprint of object
   * Create different functionality of Alexa in order it to work properly
   * Object ~ Instance
   * controlCenter is an Object or Instance of a class named Alexa
   * */

   // Instance Variable
    int a = 2;
    // Static keyword gives you an exemption to use Object to consume the variable or method. You can
    // only use Class Name to call or consume static variable.
    static int c = 5;


    // This class has capacity to build or construct Alexa object
    // Below signature stands for Alexa Constructor
    public Alexa(){
        // This guy Alexa() has the capacity to build object. Thus we can name this guy as Builder or Constructor
    }

    public static void main(String[] args){
        // No instructions to execute turnOnFan() or turnOffFan()
        // Let's create an object using the constructor or builder Alexa()
        // ClassName objectName = new CallTheConstructor;
        Alexa controlCenter = new Alexa();
        controlCenter.turnOnFan();
       // controlCenter.turnOfFan();
        int c = controlCenter.a + 2;
        System.out.println("Inside Main Method c: " + c);

    }

    public void turnOnFan(){
        // You can implement your code here to enable Alexa Turn On Fan functionality
        System.out.println("Turn on fan");
        System.out.println("***** Fan is on now.. Enjoy!!!! ******");
        // Real logic to turn on some fan.....
        int b = 3;
        int c = a + b;
        System.out.println("Result c: " + c);

    }

    public void turnOfFan(){
        // You can implement your code here to enable Alexa Turn On Fan functionality
        System.out.println("Turn off fan");
        System.out.println("***** Fan is off now. ******");
    }

}
