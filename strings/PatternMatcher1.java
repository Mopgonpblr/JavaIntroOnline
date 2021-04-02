package strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher1 {
    public static void main(String[] argv) {

        String inputStr = "Twas brillig, and the slithy toves\n" +
                "Did gyre and gimble in the wabe.\r\n" +
                "All mimsy were the borogoves,\n" +
                "And the mome raths outgrabe.\r\n" +
                "Beware the Jabberwock, my son,\n" +
                "The jaws that bite, the claws that catch.\n" +
                "Beware the Jubjub bird, and shun\n" +
                "The frumious Bandersnatch.";

        //System.out.println(sortParagraphs(inputStr));
        //sortWords(inputStr);
        sortSymbols(inputStr, 'a');
    }

    private static String sortParagraphs(String inputStr) {
        String[] paragraphs = Pattern.compile("(?m)(\\r\\n)").split(inputStr);
        int[] count = new int[paragraphs.length];
        System.out.println(Arrays.toString(paragraphs));
        for (int j = 0; j < paragraphs.length; j++) {
            for (int i = 0; i < paragraphs[j].length(); i++) {
                if (paragraphs[j].substring(i, i + 1).matches("[!?.]")) {
                    count[j]++;
                }
            }
        }
        System.out.println(Arrays.toString(count));
        for (int j = 0; j < paragraphs.length - 1; j++) {
            if (count[j] > count[j + 1]) {
                String str = paragraphs[j];
                paragraphs[j] = paragraphs[j + 1];
                paragraphs[j + 1] = str;
                j = 0;
            }
        }
        StringBuilder newString = new StringBuilder();
        for (String n : paragraphs) {
            newString.append(n + "\r\n");
        }
        return newString.toString();
    }

    private static void sortWords(String inputStr) {
        String[] sentences = Pattern.compile("[?!.]\\s*").split(inputStr);

        for (String st1 : sentences)
            System.out.println(st1);

        String[][] words = new String[sentences.length][];
        for (int i = 0; i < sentences.length; i++)
            words[i] = sentences[i].split("\\b,*\\s");
        for (int i = 0; i < sentences.length; i++)
            for (int j = 0; j < words[i].length - 1; )
                if (words[i][j].length() > words[i][j + 1].length()) {
                    String str = words[i][j + 1];
                    words[i][j + 1] = words[i][j];
                    words[i][j] = str;
                    j = 0;
                } else
                    j++;
        for (String[] st : words)
            System.out.println(Arrays.toString(st));
    }

    private static void sortSymbols(String inputStr, char symbol) {
        String[] sentences = Pattern.compile("[?!.]\\s*").split(inputStr);
        String[][] words = new String[sentences.length][];
        int[] count;
        for (int i = 0; i < sentences.length; i++)
            words[i] = sentences[i].split("\\b,*\\s");
        for (int i = 0; i < sentences.length; i++) {
            count = new int[words[i].length];
            for (int j = 0; j < words[i].length; j++) {
                Pattern p = Pattern.compile(String.valueOf(symbol));
                Matcher m = p.matcher(words[i][j]);
                while (m.find()) {
                    count[j]++;
                }
            }
            for (int j = 0; j < count.length - 1; ) {
                if (count[j] < count[j + 1]) {
                    String str = words[i][j + 1];
                    words[i][j + 1] = words[i][j];
                    words[i][j] = str;
                    int c = count[j];
                    count[j] = count[j + 1];
                    count[j + 1] = c;
                    j = 0;
                } else j++;
            }

            for (int j = 0; j < count.length - 1; j++) {
                if (count[j] == count[j + 1]) {
                    if (words[i][j].compareToIgnoreCase(words[i][j + 1]) > 0) {
                        String str = words[i][j + 1];
                        words[i][j + 1] = words[i][j];
                        words[i][j] = str;
                        j = 0;
                    }
                }
            }
        }
        for (String[] st : words)
            System.out.println(Arrays.toString(st));
    }
}   
