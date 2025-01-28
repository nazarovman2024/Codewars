import java.util.Arrays;

public class kyu8 {
    // Abbreviate a Two Word Name
    // https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
    public static String abbrevName(String name){
        String[] words = name.split(" ");
        String str = words[0].charAt(0)+"."+words[1].charAt(0);
        return(str.toUpperCase());
    }

    // Are You Playing Banjo?
    // https://www.codewars.com/kata/53af2b8861023f1d88000832/train/java
    public static String areYouPlayingBanjo(String name) {
        if(name.charAt(0)=='r' || name.charAt(0)=='R') {
            return(name + " plays banjo");
        } else {
            return(name + " does not play banjo");
        }
    }

    // Function 1 - hello world
    // https://www.codewars.com/kata/523b4ff7adca849afe000035/train/java
    public static String greet(){
        return("hello world!");
    }

    // How good are you really?
    // https://www.codewars.com/kata/5601409514fc93442500010b/train/java
    public static boolean howGoodAreYouReally(int[] classPoints, int yourPoints) {
        double averagePoint = 0;
        for(int point: classPoints){
            averagePoint += point;
        }
        averagePoint /= (classPoints.length);
        return yourPoints>averagePoint;
    }

    // Opposite number
    // https://www.codewars.com/kata/56dec885c54a926dcd001095/train/java
    public static int oppositeNumber(int number){
        return(number*(-1));
    }

    // Opposites Attract
    // https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
    public static boolean oppositesAttract(final int flower1, final int flower2){
        return((flower1+flower2)%2==1);
    }

    // Remove First and Last Character
    // https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java
    public static String removeFirstAndLastCharacter(String str){
        return(str.substring(1, str.length()-1));
    }

    // Return Negative
    // https://www.codewars.com/kata/55685cd7ad70877c23000102/train/java
    public static int makeNegative(final int x){
        if(x<0){
            return(x);
        } else {
            return(-x);
        }
    }

    // Reversed Strings
    // https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java
    public static String reversedStrings(String str) {
        StringBuilder result = new StringBuilder(str).reverse();
        return result.toString();
    }

    // Rock Paper Scissors!
    // https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/java
    public static String rockPaperScissors(String p1, String p2){
        if(p1.equals(p2)) {
            return ("Draw!");
        } else if ((p1.equals("rock") && p2.equals("scissors"))||
                (p1.equals("scissors") && p2.equals("paper"))||
                (p1.equals("paper") && p2.equals("rock"))){
            return("Player 1 won!");
        } else {
            return ("Player 2 won!");
        }
    }

    // Find the smallest integer in the array
    // https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
    public static int findSmallestInt(int[] args){
        return(Arrays.stream(args).min().getAsInt());
    }

    // MakeUpperCase
    // https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7/train/java
    public static String makeUpperCase(String str){
        return(str.toUpperCase());
    }

    // You only need one - Beginner
    // https://www.codewars.com/kata/57cc975ed542d3148f00015b/train/java
    public static boolean youOnlyNeedOne_Beginner(Object[] a, Object x){
        for(Object elem : a) {
            if(elem == x) {
                return (true);
            }
        }
        return (false);
    }
}
