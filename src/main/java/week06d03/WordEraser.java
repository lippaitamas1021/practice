package week06d03;

public class WordEraser {

    public String eraseWord(String words, String word) {
        StringBuilder sb = new StringBuilder();
        String[] temp = words.split(" ");
        for (String s : temp) {
            if (s.equals(word)) {
                sb.append("");
            } else {
                sb.append(s + " ");
            }
        }
        return sb.toString().trim();
    }
}
