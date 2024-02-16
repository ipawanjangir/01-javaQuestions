// Basic-1 question solve

//  Q:1  Write a Java program to print 'Hello' on screen and your name on a separate line.?

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("Pawan kumar");
    }

    public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }
}

// Q:2 write the sum of two numbers?

/**
 * Demo1
 */
public class Demo1 {

    public static void main(String[] args) {
        int a = 74;
        int b = 36;
        int c = a + b;
        System.out.println(c);
    }
}

// Q:3 Write a Java program to divide two numbers and print them on the screen.?
/**
 * InnerDemo1
 */
class Demo2 {
    public static void main(String[] args) {
        int a = 50;
        int b = 3;
        int div = a / b;
        System.out.println(div);
    }

}

// Q:4. Write a Java program to print the results of the following operations.
// Test Data:
// a. -5 + 8 * 6
// b. (55+9) % 9
// c. 20 + -3*5 / 8
// d. 5 + 15 / 3 * 2 - 8 % 3

/**
 * InnerDemo1
 */
class InnerDemo1 {

    public static void main(String[] args) {
        int a = -5, b = 8, c = 6;
        int result1 = -a + b * c;
        int d = 55, e = 9, f = 9;
        int result2 = (a + b) % c;
        int g = 20, h = 3;
        int result3 = a + (b * 5) / h;
        int j = 5, k = 15, l = 2, m = 3;
        int result4 = l + k / 3 * l - 8 % m;
        System.out.println(result1 + "\n" + result2 + "\n" + result3 + "\n" + result4);

    }
}

// Q:5 Write a Java program that takes two numbers as input and displays the
// product of two numbers.?

class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number");
        int a = sc.nextInt();
        System.out.println(" enter a second number");
        int b = sc.nextInt();
        int c = a * b;
        System.out.println(c);
    }
}

// basic-2 questions solve

// Q:151 . Write a Java program to find the value of a specified expression.
// a) 101 + 0) / 3
// b) 3.0e-6 * 10000000.1
// c) true && true
// d) false && true
// e) (false && false) || (true && true)
// f) (false || false) && (true && true)

class Test {
    public static void main(String[] args) {
        double a = (101 + 0) / 3;

        double b = 3.0e-6 * 10000000.1;
        boolean c = true && true;
        boolean d = false && true;
        boolean e = (false && false) || (true && true);
        boolean f = (false || false) && (true || true);

        System.out.println("101 + 0) / 3 -" + a);
        System.out.println("3.0e-6* 10000000.1-" + b);
        System.out.println("true && true -" + c);
        System.out.println("false && true -" + d);
        System.out.println("(false && false)||(true&&true) -" + e);
        System.out.println("(false || false) && ( true || true) -" + f);

    }
}

// Q:152 Write a Java program that accepts four integers from the user and
// prints equal if all four are equal, and not equal otherwiseub

class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number  ");
        int a = sc.nextInt();
        System.out.println("enter the second number ");
        int b = sc.nextInt();
        System.out.println(" enter the third number ");
        int c = sc.nextInt();
        System.out.println(" enter the fouth number ");
        int d = sc.nextInt();

        if (a == b && b == c && c == d) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

// Q:153 . Write a Java program that accepts two double variables and test if
// both strictly between 0 and 1 and false otherwise.

class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println(" enter the second number");
        int b = sc.nextInt();

        if (a > 0 && a < 1 && b > 0 && b < 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

// Q:154. Write a Java program to print the contents of a two-dimensional
// Boolean array where t represents true and f represents false.

// Sample array:
// array = {{true, false, true},
// {false, true, false}};

class Test3 {
    public static void main(String[] args) {
        boolean arr[][] = { { true, false, true }, { false, true, false } };

        int row_arr = arr[0].length;
        int col_arr = arr[0].length;

        for (int i = 0; i < row_arr; i++) {
            for (int j = 0; j < col_arr; j++) {
                if (arr[i][j]) {
                    System.out.print("t" + " ");
                } else {
                    System.out.print("f" + " ");
                }
            }
        }
    }
}

// Q:155. Write a Java program to print an array after changing the rows and
// columns of a two-dimensional array.?

class Test4 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30 };
        int ab[] = { 40, 50, 60 };

    }
}

// java method questions solve

// Q:1 Write a Java method to find the smallest number among three numbers.

class method1 {

    public static double smallest(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number ");
        double a = sc.nextDouble();
        System.out.println("enter the second number ");
        double b = sc.nextDouble();
        System.out.println("enter the third number ");
        double c = sc.nextDouble();

        System.out.println("the smallest value is " + smallest(a, b, c) + "\n");

        method1 m1 = new method1();
        m1.smallest(a, b, c);

    }

}

// Q:2. Write a Java method to compute the average of three numbers.

class method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number ");
        int a = sc.nextInt();
        System.out.println("enter the second number ");
        int b = sc.nextInt();
        System.out.println(" enter the third number  ");
        int c = sc.nextInt();

        System.out.println("the average of three numbers " + average(a, b, c) + "\n");
    }

    public static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}

// Q: 3. Write a Java method to display the middle character of a string.
// Note: a) If the length of the string is odd there will be two middle
// characters.
// b) If the length of the string is even there will be one middle character.

class method3 {

    public static String middle(String str) {
        int p;
        int length;
        if (str.length() % 2 == 0) {
            p = str.length() / 2 - 1;
            length = 2;
        } else {
            p = str.length() / 2;
            length = 1;
        }
        return str.substring(p, p + length);
    }

    public static void main(String[] args) {
        String str = "350";
        System.out.println("the middle of this string values   " + middle(str));
        method3 m3 = new method3();
        m3.middle(str);

    }

}

// Q: 4. Write a Java method to count all vowels in a string.

class method4 {
    public static int count_Vowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        System.out.println("string count vowels " + count_Vowels(str));
        method4 m4 = new method4();
        m4.count_Vowels(str);
    }
}

// Q:5. Write a Java method to count all the words in a string.?

// class method5 {

// public static String count(String str)
// {
// int count=0;
// int letter=0;
// for(int i=0;i<str.length();i++)
// {
// if(str.charAt(i)==1)
// {
// System.out.println(str.toCharArray(str.));
// }
// }

// return "";
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the string ");
// String str = sc.nextLine();
// System.out.println(" the alpbhabit counter " + count());
// method5 m5 = new method5();
// }
// }

// data type question solve
// Q:1. Write a Java program to convert temperature from Fahrenheit to Celsius
// degrees.

/**
 * InnerDemo1_1
 */
class Demo4 {
    public static void main(String[] args) {
        float c = 0;
        float f = 212.0f;
        c = ((5 * (f - 32)) / 9);
        System.out.println("the f to c temp is :" + c);
    }
}

// Q:2 Write a Java program that reads a number in inches and converts it to
// meters.
/**
 * InnerDemo1_2
 */
class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the inch value ");
        double inch = sc.nextFloat();
        double meter = 0;
        meter = inch * 0.0254;
        System.out.println(meter);
    }
}

// Q:3. Write a Java program that reads an integer between 0 and 1000 and adds
// all the digits in the integer.

class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  the interger value between in 0 and 1000 ");
        int number = sc.nextInt();
        int sum = 0;
        int digit = 0;
        int temp = number;

        while (number > 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;

        }
        System.out.println("the original value is " + temp + " sum of digit " + sum);
        sc.close();

    }
}

// Q:4 Write a Java program to convert minutes into years and days.

class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long mints = sc.nextInt();

        long day = mints * 60 * 365;
        long year = (mints / 60 / 24) % 365;

        System.out.println(year);

        // System.out.println(mints + " minutes is approximately " + year + "years and"
        // + day + " days");
    }
}

// conditional statement questions slove

/**
 * InnerDemo1_5
 */
class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input value");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number ");
        }
    }
}

class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the fisrt number ");
        int a = sc.nextInt();
        System.out.println("enter the second number ");
        int b = sc.nextInt();
        System.out.println("enetr the third number ");
        int c = sc.nextInt();

        if (a > b) {
            System.out.println("the greater " + a);
        } else if (b > c) {
            System.out.println(" the greater " + b);
        } else {
            System.out.println("the greater " + c);
        }
    }
}

/**
 * InnerDemo1_7
 */
class Demo0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a 0 and 100000 integer value ");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("input value  " + a);
            System.out.println("positive value");
        } else {
            System.out.println("input value" + a);
            System.out.println("nagetive value");
        }
    }
}

/**
 * InnerDemo1_8
 */
class Demo11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the any number");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("wrong value input");
                break;
        }
    }
}

// recursion method question solve

/**
 * InnerDemo1_9
 */
class Demo12 {

    public static void main(String[] args) {

        int a = 1;
        int fact = 5;

        for (int i = 1; i <= fact; i++) {
            a = a * i;
        }
        System.out.println("the factorial of " + fact + " is " + a);

    }
}

/**
 * InnerDemo1_10
 */
class Demo13 {

    public static void main(String[] args) {
        int n = 100;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            // System.out.println("the sum of n number sum " + sum);
        }
        System.out.println(sum);

    }
}

/**
 * InnerDemo1_11
 */
class Demo14 {
    public static void main(String[] args) {
        int a = 0, b = 1, c;

        for (int i = 1; i < 10; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + "  ");
        }
    }

}

class Demo22 {
    public static void main(String[] args) {
        String str = "level";
        char first_c = str.charAt(0);
        char last_c = str.charAt(str.length() - 1);

        if (first_c == last_c) {
            System.out.println("this string are polindrom");
        } else {
            System.out.println("this string are not polindrom");
        }
    }
}