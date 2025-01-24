// https://www.codewars.com/kata/5601409514fc93442500010b/train/java
public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double averagePoint = 0;
        for(int point: classPoints){
            averagePoint += point;
        }
        averagePoint /= (classPoints.length);
        return yourPoints>averagePoint;
    }
}
