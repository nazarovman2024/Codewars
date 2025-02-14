import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.round;

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

    // Highest and Lowest
    // https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
    public static String highAndLow(String numbers){
        String[] numbersStringArray = numbers.split(" ");
        int[] numbersArray = new int[numbersStringArray.length];
        for(int i=0; i<numbersStringArray.length; i++){
            numbersArray[i] = Integer.parseInt(numbersStringArray[i]);
        }
        Arrays.sort(numbersArray);
        return numbersArray[numbersArray.length-1]+" "+numbersArray[0];
    }

    // Shortest Word
    // https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java
    public static int findShort(String s){
        String[] words = s.split(" ");
        int[] x = new int[words.length];
        for(int i=0; i<words.length; i++){
            x[i] = words[i].length();
        }
        Arrays.sort(x);
        return x[0];
    }

    // Ones and Zeros
    // https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java
    public static int convertBinaryArrayToInt(List<Integer> binary){
        int sum = 0;
        for(int i=binary.size()-1; i>=0; i--){
            sum += binary.get(0)*pow(2,i);
            binary.remove(0);
        }
        return sum;
    }

    // Disemvowel Trolls
    // https://www.codewars.com/kata/52fba66badcd10859f00097e/java
    public static String disemvowel(String str){
        return str.replaceAll("(?i)[aeiou]","");
    }

    // Isograms
    // https://www.codewars.com/kata/54ba84be607a92aa900000f1/java
    public static boolean isIsogram(String str){
        str = str.toUpperCase();
        for(int i=0;i<str.length()-1;i++){
            if(str.substring(i+1).contains(Character.toString(str.charAt(i))))
                return false;
        }
        return true;
    }

    // Vowel Count
    // https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
    public static int getCount(String str){
        int count = 0;
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        return count;
    }

    // Get the Middle Character
    // https://www.codewars.com/kata/56747fd5cb988479af000028/train/java
    public static String getMiddle(String word){
        int x = word.length();
        if (x%2==0) return word.substring(x/2-1,(x/2+1));
        return Character.toString(word.charAt(x/2));
    }

    // Printer Errors
    // https://www.codewars.com/kata/56541980fa08ab47a0000040/train/java
    public static String printerError(String s){
        String e = s.replaceAll("[a-m]","");
        return e.length()+"/"+s.length();
    }

    // String ends with?
    // https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java
    public static boolean solution(String str, String ending){
        return ending.length()<=str.length()&&ending.equals(str.substring(str.length() - ending.length()));
    }

    // Binary Addition
    // https://www.codewars.com/kata/551f37452ff852b7bd000139/java
    public static String binaryAddition(int a, int b){
        int x = a+b;
        StringBuilder str = new StringBuilder();
        do {
            str.append(x%2);
            x/=2;
        }while(x>0);
        return str.reverse().toString();
    }

    // Sum of the first nth term of Series
    // https://www.codewars.com/kata/555eded1ad94b00403000071/train/java
    public static String seriesSum(int n){
        double x = 0.0;
        for(int i=0;i<n;i++) x += (double) 1 / (1 + (i * 3));
        return String.format("%.2f",x);
    }

    // Friend or Foe?
    // https://www.codewars.com/kata/55b42574ff091733d900002f/train/java
    public static List<String> friend(List<String> x) {
        List<String> result = new ArrayList<>();

        for (String str : x) {
            if (str.length() == 4) {
                result.add(str);
            }
        }
        return result;
    }

    // Mumbling
    // https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java
    public static String accum(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            String str = s.substring(i, i + 1).toUpperCase();
            result.append(str);
            for (int counter = i; counter > 0; --counter) {
                result.append(str.toLowerCase());
            }
            result.append("-");
        }

        return result.deleteCharAt(result.length() - 1).toString();
    }
}
