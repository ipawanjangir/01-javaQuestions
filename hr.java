import java.util.Scanner;

class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enetr a value");
        int num = sc.nextInt();

        calculate cal = new calculate();
        cal.percentageCalculate(num);
    }
}