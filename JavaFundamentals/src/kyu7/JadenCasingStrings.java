package kyu7;

// https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java
public class JadenCasingStrings {
    public static String toJadenCase(String phrase){
        if(phrase==null||phrase.isEmpty()){
            return(null);
        } else {
            StringBuilder string = new StringBuilder();
            for(int i=0; i<phrase.length();i++){
                if(i==0||phrase.charAt(i-1)==' '){
                    string.append(phrase.substring(i,i+1).toUpperCase());
                } else {string.append(phrase.charAt(i));}
            }
            return(string.toString());
        }
    }
}
