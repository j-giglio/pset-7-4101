import java.util.Objects;

public class ProblemSet7 {
    public static void main(String[] args) {

    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    public String surroundMe(String in, String out) {
        if (in != null && out != null && out.length() == 4) {
            in = out.substring(0, 2).concat(in);
            in = in.concat(out.substring(2));
        }
        return in;
    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text (overlapping, as needed).
     */
    public String endsMeet(String text, int n) {
        if (text != null && text.length() <= 10 && text.length() >= 1 && n >= 1 && n <= text.length() / 2 ) {
            return text.substring(0, n).concat(text.substring(text.length() - n));
        } else {
            return text;
        }
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */
    public String middleMan(String text) {
        if (text != null && text.length() % 2 == 1 && text.length() > 2) {
            text = text.substring(text.length()/2, (text.length()/2) + 2);
        }
        return text;
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    public boolean isCentered(String text, String target) {
        if (text != null && text.length() % 2 == 1 && text.length() > 2) {
            text = text.substring(text.length()/2 - 1, text.length()/2 + 2);
        }
        return target != null && Objects.equals(text, target) && target.length() == 3;
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */
    public int countMe(String text, char suffix) {
        if (Character.isLetter(suffix) && text != null) {
            int count = 0;
            String[] words = text.split(" ");
            for (String word : words) {
                count = (word.endsWith(String.valueOf(suffix))) ? count + 1 : count;
            }
            return count;
        } else {
            return -1;
        }
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */
    public int triplets(String text) {
        if (text != null) {
            int count = 0;
            for (int i = 0; i < text.length() - 2; i++) {
                if (text.charAt(i) == text.charAt(i + 1) && text.charAt(i) == text.charAt(i + 2)) {
                    count++;
                }
            }
            return count;
        } else {
            return -1;
        }
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */
    public long addMe(String text) {
        if (text != null) {
            int sum = 0;
            for (int i = 0; i < text.length(); i++) {
                if (Character.isDigit(text.charAt(i))) {
                    sum += text.charAt(i) - 48;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */
    public long sequence(String text) {
        if (text != null) {
            long longest = 0;
            for (int i = 0; i < text.length(); i++) {
                long sum = 1;
                for (int j = i + 1; j < text.length() && text.charAt(i) == text.charAt(j); j++) {
                    sum++;
                }
                if (sum > longest) {
                    longest = sum;
                }
            }
            return longest;
        } else {
            return -1;
        }
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    public String intertwine(String a, String b) {
        if (a != null && b != null) {
            String c = "";
            for (int i = 0; i < a.length() || i < b.length(); i++){
                if (i < a.length()) {
                    c = c.concat(a.substring(i, i+1));
                }
                if (i < b.length()) {
                    c = c.concat(b.substring(i, i+1));
                }
            }
            return c;
        } else {
            return null;
        }
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */
    public boolean isPalindrome(String text) {
        if (text != null) {
            boolean c = true;
            for (int i = 0; c && i < text.length() / 2; i++){
                c = text.charAt(i) == text.charAt(text.length() - 1 - i);
            }
            return c;
        } else {
            return false;
        }
    }
}
