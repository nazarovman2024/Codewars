// https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java
public class ReversedStrings {
    public static String solution(String str) {
        StringBuilder result = new StringBuilder(str).reverse();
        return result.toString();
    }
}