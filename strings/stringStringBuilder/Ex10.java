package strings.stringStringBuilder;

public class Ex10 {
    public static void main(String[] args) {
        String x = "There are also word-unit palindromes in which the unit of reversal is the word. " +
                "Is it crazy how saying sentences backwards creates backwards sentences saying how crazy " +
                "it is? Word-unit palindromes were made popular in the recreational linguistics community " +
                "by Lindon in the 1960s. Occasional examples in English were created in the 19th " +
                "century. Several in French and Latin date to the Middle Ages.";
        int count = 0;
        for (int i = 0; i < x.length(); i++)
            if (x.charAt(i) == '.' || x.charAt(i) == '!' || x.charAt(i) == '?')
                count++;

        System.out.println("Number of sentences: " + count);
    }
}
