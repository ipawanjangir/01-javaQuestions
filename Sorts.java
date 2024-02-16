import java.util.Arrays;

class Sorts extends Thread {
    public void run() {
        int a[] = { 12, 43, 23, 55 };
        Arrays.sort(a);

    }

    public static void main(String[] args) {

        Sorts s = new Sorts();
        s.start();
    }
}
