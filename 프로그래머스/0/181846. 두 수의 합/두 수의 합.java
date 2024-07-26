import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        BigInteger bia = new BigInteger(a);
        BigInteger bib = new BigInteger(b);
        BigInteger sum = bia.add(bib);
        return sum.toString();
    }
}