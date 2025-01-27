package kyu8;

// https://www.codewars.com/kata/57cc975ed542d3148f00015b/train/java
public class YouOnlyNeedOne_Beginner {
    public static boolean check(Object[] a, Object x){
        for(Object elem : a) {
            if(elem == x) {
                return (true);
            }
        }
        return (false);
    }
}
