
public class Q5 {


    static boolean palindrome(String word) {
        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            char b = word.charAt((word.length() - (i + 1)));
            if (a == b) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //Should return true
        System.out.println(palindrome("racecare"));
        }
    }

