import java.util.HashMap;
import java.util.Map;

public class Q1 {

    static  Map<Integer, String> setLibrary(Integer[] year, String[] animal){
        Map<Integer, String> library = new HashMap<Integer, String>();
        for (int i = 0; i < 12; i++){
            library.put(year[i],animal[i]);
        }
        return library;
    }
//    static String mySign(Integer year, Map<Integer, String> lib){
//        if (year > 2002){
//            int dif = year -
//        } if (year < 1992){
//
//        }
//        return lib.get(year);
//    }
    
    // Testing things out rn
    public static void main(String[] args) {

        Integer[] year = {1992,1993,1994,1994,1995,1996,1997,1998,1999,2000,2001,2002};
        String[] animal = {"Bear","Pig","Rooster","Dog","Cat","Horse","Lion","Bull",
                "Goat","Snake","Monkey","Spider","Elephant","Rhino","Shark"};

        Map<Integer, String> library = setLibrary(year,animal);


        System.out.println(2004 % 12);
    }
}
