package strings.patternMatcher;

import java.util.regex.*;

public class Ex1 {
    public static void main(String[] args) {
        String inputStr = "Twas brillig, and the slithy toves\n" +
                "Did gyre and gimble in the wabe.\r\n" +
                "All mimsy were the borogoves,\n" +
                "And the mome raths outgrabe.\n" +
                "Beware the Jabberwock, my son,\n" +
                "The jaws that bite, the claws that catch.\r\n" +
                "Beware the Jubjub bird, and shun\n" +
                "The frumious Bandersnatch.";
        System.out.println(sortParagraphs(inputStr));
        //System.out.println(sortWordsLength(inputStr));
        //System.out.println(sortLexemes(inputStr, 'a'));
    }

    private static String sortParagraphs(String s) {
        String[] text = Pattern.compile("(?m)\\r\\n").split(s);
        for (int i = 1; i < text.length; i++) {
            if (counter(text[i], "(?m)[.?!]") < counter(text[i - 1], "(?m)[.?!]")) {
                String temp = text[i];
                text[i] = text[i - 1];
                text[i - 1] = temp;
                i = 0;
            }
        }
        StringBuilder sorted = new StringBuilder();

        for (String par : text) {
            sorted.append(par).append("\r\n\n");

        }
        return sorted.toString();
    }

    private static String sortWordsLength(String s) {
        StringBuilder text = new StringBuilder();
        String[] sentences = Pattern.compile("[.?!]+\\s+").split(s);
        for (String sentence : sentences) {
            String[] words = sentence.split("\\W+");
            for (int i = 0; i < words.length - 1; ) {
                if (words[i].length() > words[i + 1].length()) {
                    String temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                    i = 0;
                } else
                    i++;
            }
            for (String word : words)
                text.append(word).append(" ");
            text.append("\n");
        }
        return text.toString();
    }

    private static String sortLexemes(String s, char symbol) {
        StringBuilder text = new StringBuilder();
        String[] sentences = Pattern.compile("[.?!]+\\s+").split(s);
        String c = symbol + "";
        for (String sentence : sentences) {
            String[] words = sentence.split("\\W+");
            for (int i = 1; i < words.length; ) {
                if (counter(words[i], c) > counter(words[i - 1], c) ||
                        (counter(words[i], c) == counter(words[i - 1], c) &&
                                words[i - 1].compareToIgnoreCase(words[i]) > 0)) {
                    String temp = words[i - 1];
                    words[i - 1] = words[i];
                    words[i] = temp;
                    i = 1;
                } else if (words[i - 1].compareToIgnoreCase(words[i]) == 0) {
                    words[i] = "";
                    i++;
                } else i++;
            }
            for (String word : words)
                if (!word.equals(""))
                    text.append(word).append(" ");
            text.append("\n");
        }
        return text.toString();
    }

    private static int counter(String s, String c) {
        int count = 0;
        Matcher m = Pattern.compile(c).matcher(s);
        while (m.find())
            count++;
        return count;
    }
}