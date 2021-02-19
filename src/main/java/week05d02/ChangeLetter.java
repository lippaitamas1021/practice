package week05d02;

public class ChangeLetter {

    private static final String VOWELS = "aeiou";
    private static final String REPLACE = "*";

    public String changeVowels(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            String s = word.substring(i, i+1);
            if (VOWELS.contains(s)) {
                sb.append(REPLACE);
            } else {
                sb.append(s);
            }
            }
        return sb.toString();
    }

    public static void main(String[] args) {
        ChangeLetter cl = new ChangeLetter();
        System.out.println(cl.changeVowels("almafa"));
    }
}
