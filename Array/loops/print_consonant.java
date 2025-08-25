public class print_consonant {
    public static void main(String[] args) {
        System.out.println("Consonants in the English alphabet:");

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (!isVowel(ch)) {
                System.out.print(ch + " ");
            }
        }
    }

    // Function to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}

