import org.omg.CORBA.INTERNAL;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Q4 {



    public static void main(String[] args) {

        // 2D array
        int[][] matrix =   { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 },
                { 26, 27, 28, 29, 30}};

        ArrayList<Integer> checklist = new ArrayList<Integer>();

        int index;
        int row = matrix.length;
        int column = matrix[0].length;

        if(row > matrix[0].length){
            index = row;
        }else{
            index = column;
        }

        for(int a = 0;a < index; a++){
            if (row > a){
                for (int item: matrix[a]){
                    if(!(checklist.contains(item))){
                        System.out.print(item + " ");
                        checklist.add(item);
                    }
                }
                System.out.println("");
            }
            if (column > a){
                for (int[] i: matrix){
                    if(!checklist.contains(i[a])){
                        System.out.print(i[a] + " ");
                        checklist.add(i[a]);
                    }
                }
                System.out.println("");
            }
        }




 /*
        - - Fail - -

        for (int row = 0; row < matrix.length; row++){
             this targets the
            if((i % 2) == 0){
                for (int item : matrix[i]) {

                }

            for(int column : matrix[row]){
                    if(!answer.contains(column)){
                        answer.add(column)
                    }
*/






    }
}
