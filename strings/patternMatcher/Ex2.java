package strings.patternMatcher;

import java.util.regex.*;

public class Ex2 {
    public static void main(String[] argv) throws Exception {

        String inputStr = "<notes>\n" +
                "<note id = \"1\">\n" +
                "<to>Вася</to>\n" +
                "<from>Света</from>\n" +
                "<heading>Напоминание</heading>\n" +
                "<body>Позвони мне завтра!</body>\n" +
                "</note>\n" +
                "<note id = \"2\">\n" +
                "<to>Петя</to>\n" +
                "<from>Маша</from>\n" +
                "<heading>Важное напоминание</heading>\n" +
                "<body/>\n" +
                "</note>\n" +
                "</notes>";

        xmlAnalyser(inputStr);
    }

    private static void xmlAnalyser(String inputStr) {
        Matcher openTag = Pattern.compile("<(\\w+)[^>]*>").matcher(inputStr);
        while (openTag.find()) {
            Matcher tag = Pattern.compile("((<" + openTag.group(1) + ">|" +
                    "<" + openTag.group(1) + "\\s[^>]*>)(.+?)(</" + openTag.group(1) + ">))|" +
                    "(<" + openTag.group(1) + "/>)", Pattern.DOTALL).matcher(inputStr);
            if (tag.find()) {
                if (tag.group(1) != null) {
                    System.out.println(tag.group(2) + ", " + tag.group(4) + ", " + tag.group(3) + ", "
                            + tag.group(0).replaceFirst(tag.group(3), ""));
                    System.out.println();
                    inputStr = inputStr.replaceFirst(tag.group(2), "").replaceFirst(tag.group(4), "");
                } else {
                    System.out.println(tag.group());
                    inputStr = inputStr.replaceFirst(tag.group(), "");
                }
            }
        }
    }
}
