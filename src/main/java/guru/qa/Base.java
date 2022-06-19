package guru.qa;


public class Base {

    // используется постоянно
    boolean bool = false;
    char character = 'a';

    byte aByte = -128;
    short aShort = 0;

    // используется постоянно
    int aInteger = 0;

    //массив
    int[] arr = new int[]{1, 2, 3};

    long aLong = 0;


    float aFloat = 0.0F;

    // используется более менее
    double aDouble = 0.0;

    // класс - тип данных
    String str = "abc";

    // объекты типа string имеют поведение, которое и описывается методами
    String str = "abc";

    void method() {
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);
    }
}

    // написали в классе Base метод someMethod
    void someMethod() {
        int result = 1 + 4;
        int result0 = 1 - 4;
        int result1 = 10 / 3;
        int result2 = 10 % 3;
        int result3 = 10 * 3;

        boolean result4 = ((3 < 2) || (4 < 2));
        boolean result5 = 3 >= 2;
        boolean result6 = 3 < 2;
        boolean result7 = 3 <= 2;
        boolean result8 = 3 != 2;
        boolean result9 = 3 == 2;    // равно
        boolean result10 = !(3 > 2); // false
    }