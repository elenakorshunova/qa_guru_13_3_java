package guru.qa;

public class JavaBasicTypes {

    // Java operators
    public static void javaOperators() {
        int add = 10 + 3;
        int subtract = 5 - 2;
        int multiply = 7 * 7;
        int divide = 10 / 3;
        int module = 10 % 3;

        System.out.println("Additional = " + add);
        System.out.println("Subtraction = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + divide);
        System.out.println("Modulus = " + module);

        boolean boo1 = 8 == 9;
        boolean boo2 = 8 > 9;
        boolean boo3 = 8 < 9;
        boolean boo4 = 8 >= 9;
        boolean boo5 = 8 <= 9;
        boolean boo6 = 8 != 9;

        System.out.println("Boo1 should be = " + boo1);
        System.out.println("Boo2 should be = " + boo2);
        System.out.println("Boo3 should be = " + boo3);
        System.out.println("Boo4 should be = " + boo4);
        System.out.println("Boo5 should be = " + boo5);
        System.out.println("Boo6 should be = " + boo6);

    //Сonditional operation
        int speed = 65;
        if ((speed >= 20) && (speed < 40)) {
            System.out.println("Fine is 500RUB");
        } else if ((speed >= 40) && (speed < 60)) {
            System.out.println("Fine is 1500RUB");
        } else if ((speed >= 60) && (speed < 80)) {
            System.out.println("Fine is 2500RUB");
        } else if ((speed >= 80) && (speed < 1228)) {
            System.out.println("Fine is 5000RUB");
        } else {
            System.out.println("No fine");
        }
    }

    // Operations with mixed data types
    public static void javaOperations() {
        String s = "5000";
        int i = 5000;
        float f = 11.5F;
        double d = -6.5;
        System.out.println("Mixed integer and double = " + (i % d));
        System.out.println("Mixed integer and float = " + (i / f));
        System.out.println("Mixed string and int = " + (s + i));
    }

    // Overflow min & max
    public static void javaOverflow() {
        int overflowMin = Integer.MIN_VALUE;
        System.out.println("Overflow min value " + (overflowMin - 100000000));

        int overflowMax = Integer.MAX_VALUE;
        System.out.println("Overflow max value " + (overflowMax + 100000000));
    }


    public static void main(String[] args) {
        javaOperators();
        javaOperations();
        javaOverflow();
    }
}