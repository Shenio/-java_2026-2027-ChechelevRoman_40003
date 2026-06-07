public class Main {

    static boolean defaultBool;
    static byte defaultByte;
    static short defaultShort;
    static char defaultChar;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static String defaultString;

    public static void main(String[] args) {
        //1
        boolean boolVar = true;
        byte byteVar = 127;
        short shortVar = 32767;
        char charVar = 'A';
        int intVar = 2_147_483_647;
        long longVar = 9_223_372_036_854_775_807L;
        float floatVar = 3.14f;
        double doubleVar = 3.1415926535;
        String stringVar = "Hello!";

        //2
        char letter1 = '\u0440'; // р
        char letter2 = '\u043e'; // о
        char letter3 = '\u043c'; // м
        char letter4 = '\u0430'; // а
        char letter5 = '\u043d'; // н
        System.out.print("Имя в Unicode: ");
        System.out.println("" + letter1 + letter2 + letter3 + letter4+letter5);


        //4
        String text = "result: ";
        int number = 42;
        boolean flag = true;
        Object obj = new Object();

        String res1 = text + number;
        String res2 = text + flag;
        String res3 = text + obj;

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

        //5
        int integerNum = 10;
        double doubleNum = 2.5;
        double resultSum = integerNum + doubleNum;
        System.out.println("10 (int) + 2.5 (double) = " + resultSum + " (тип double)");

        //6

        double originalDouble = 9.99;
        int narrowedInt = (int) originalDouble;
        System.out.println("double " + originalDouble + " become: " + narrowedInt);

        int largeInt = 130;
        byte narrowedByte = (byte) largeInt;
        System.out.println("int " + largeInt + " сужен до byte: " + narrowedByte);


        //8
        var message = "Hello from var!";
        var numberVar = 100;
        System.out.println(message + " " + numberVar);
    }
}
