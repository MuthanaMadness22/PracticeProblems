import java.util.ArrayList;

public class Q6 {

    static ArrayList<Integer> fibList (int n){
        ArrayList<Integer> answer = new ArrayList<>();

        if(n == 0){
            return answer;
        }

        if(n == 1){
            answer.add(0);
            return answer;
        }

        answer.add(0);
        answer.add(1);

        if(n == 2){
            return answer;
        }


        while(answer.size() != n){
            answer.add(answer.get(answer.size()-1) + answer.get(answer.size()-2) );
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(fibList(0));

    }
}
