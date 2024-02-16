// import java.util.Scanner;

// class Count {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a string value");
//         String str = sc.next();
//         int count = 0;

//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
//                     || str.charAt(i) == 'u') {
//                 count++;

//             } else {

//                 System.out.println("without vowels alphabit is consonant " + count);
//             }
//         }
//         System.out.println("total vowels in given String :" + count);

//     }
// }

class Count {

    // Function to count vowels and consonants in a string
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        // Convert the string to lowercase to simplify comparison
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }

    public static void main(String[] args) {
        // Example usage
        String str = "pawan";
        countVowelsAndConsonants(str);
    }
}
