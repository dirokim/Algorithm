import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        String sum = "";
        String num = "";
        for(int i=0;i<a.length();i++){
            sum = ""+a.charAt(i);
            num = sum.toUpperCase();
            if(sum.equals(num)){
                answer+=sum.toLowerCase();
            }else{
                answer+=sum.toUpperCase();
            }
        }
        System.out.print(answer);
    }
}