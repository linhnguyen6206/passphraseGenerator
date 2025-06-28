// File name: PassPhrase.java
// Written by: Linh Nguyen
// Date: 4/9/2025
// Function: Generate a paraphrase of a given length using the list of words
//           provided in the file eff_wordlist.txt

public class PassPhrase1 {
    public static int readData(int[] codes, String[] words) {
        int count = 0;
        while (!StdIn.isEmpty()) {
            codes[count] = StdIn.readInt();
            words[count] = StdIn.readString();
            count++;
        }
        return count;
    }
    public static int randInt(int a, int b) {
        int range = b - a + 1;
        return a + (int) (Math.random() * range);
    } //randInt
    
    public static String getWord(int[] codes, String[] words) {
        int dice1 = randInt(1, 6);
        int dice2 = randInt(1, 6);
        int dice3 = randInt(1, 6);
        int dice4 = randInt(1, 6);
        int dice5 = randInt(1, 6);
        int number = dice1 * 10000 + dice2 * 1000 + dice3 * 100 + dice4 * 10 + dice5;
        for (int i = 0; i < readData; i++) {
            if (number == codes[count])
                return words[count];
        }
    }
    public static String getPhrase(int n) {
    String word = getWord(codes, words);
        System.out.printf("%s\t", word);
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++)
            return getPhrase(n);
    } // main()
} // class PassPhrase
