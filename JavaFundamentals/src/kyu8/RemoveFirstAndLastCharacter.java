package kyu8;

// https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java
public class RemoveFirstAndLastCharacter {
    public static String remove(String str){
        return(str.substring(1, str.length()-1));
    }
}
