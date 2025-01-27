package kyu7;

// https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java
public class ReversWords {
    public static String reversWords(final String original){
        StringBuilder string = new StringBuilder();
        int wordStart = 0;
        for(int i=0; i<original.length(); i++){
            if(original.charAt(i)==' '){
                string.append(original.charAt(i));
                wordStart = i+1;
            } else if(i==original.length()-1) {
                string.append(new StringBuilder(original.substring(wordStart)).reverse());
            } else if(original.charAt(i+1)==' ') {
                string.append(new StringBuilder(original.substring(wordStart,i+1)).reverse());
            }
        }
        return(string.toString());
    }
}
