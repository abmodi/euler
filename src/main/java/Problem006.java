/**
 * Created by abmodi on 7/15/17.
 */
public class Problem006 {
    public static void main(String[] args) {
        long sumNatural = (100 * 101)/2;
        long sumNaturalSq = sumNatural * sumNatural;
        long sumSqNatural = (100 * 101 * 201)/6;
        System.out.println(sumNaturalSq - sumSqNatural);
    }
}
