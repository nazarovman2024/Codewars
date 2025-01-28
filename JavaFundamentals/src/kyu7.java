import java.util.Arrays;

public class kyu7 {
    // Jaden Casing Strings
    // https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java
    public static String toJadenCase(String phrase){
        if(phrase==null||phrase.isEmpty()){
            return(null);
        } else {
            char[] string = phrase.toCharArray();
            for(int i=0; i<phrase.length();i++) {
                if (i == 0 || string[i - 1] == ' ') {
                    string[i] = Character.toUpperCase(string[i]);
                }
            }
            return new String(string);
        }
    }

    // Reverse words
    // https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java
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

    // Sum of two lowest positive integers
    // https://www.codewars.com/kata/558fc85d8fd1938afb000014/train/java
    public static long sumToSmallestNumbers(long[] numbers){
        long[] numb = {-1,-1};
        Arrays.sort(numbers);
        for(long x : numbers){
            if(x<0)continue;
            if(numb[0]==-1){
                numb[0] = x;
            } else { numb[1] = x; break; }
        }
        if(numb[0]==-1)return 0;
        if(numb[1]==-1)return numb[0];
        return numb[0]+numb[1];
    }
}
