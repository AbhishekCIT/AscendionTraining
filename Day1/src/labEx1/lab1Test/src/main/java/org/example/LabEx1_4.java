package labEx1.lab1Test.src.main.java.org.example;

public class LabEx1_4 {
    public static void main(String[] args) {
        String inputString = "Sum of 12 and 20 is 32";
        System.out.println("Number of words: " + countWords(inputString));
    }
    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        String[] words = sentence.split("\\s+");

        int wordCount = 0;

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                wordCount++;
            }
        }

        return wordCount;
    }
}