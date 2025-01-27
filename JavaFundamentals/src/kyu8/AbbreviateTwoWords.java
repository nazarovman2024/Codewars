package kyu8;

// https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
public class AbbreviateTwoWords {
    public static String abbrevName(String name){
        String[] words = name.split(" ");
        String str = words[0].charAt(0)+"."+words[1].charAt(0);
        return(str.toUpperCase());
    }
}
