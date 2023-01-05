public class Consumer {
    public static void main(String[] args) {
        Alexa myAlexa = new Alexa();
        int valueOfA = myAlexa.a;
        int valueOfC = Alexa.c;

        System.out.println("Value of c and d: " + valueOfA + ", " + valueOfC);

    }
}
