package kyu8;// https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
import java.util.Arrays;

public class SmallestIntegerInTheArray {
    public static int find(int[] args){
        return(Arrays.stream(args).min().getAsInt());
    }
}
