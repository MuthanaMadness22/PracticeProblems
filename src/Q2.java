import java.util.HashSet;

public class Q2 {
    public static void main(String[] args) {
        String word = "hissss * @3 123  src";

        HashSet <Character> answer = new HashSet<Character>();

        for(int i = 0; i < word.length(); i++){
           answer.add(word.charAt(i));
        }

        System.out.println(answer.size());

    }
}
