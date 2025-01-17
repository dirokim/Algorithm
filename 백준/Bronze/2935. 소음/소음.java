import java.io.*; 
import java.util.*;
import java.math.BigInteger;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        BigInteger num = new BigInteger(br.readLine()); 
        String input = br.readLine();
        BigInteger num2 = new BigInteger(br.readLine());
        BigInteger sum  = new BigInteger("0");
        if(input.equals("+")){
            sum = num.add(num2);
        }else if(input.equals("*")){
            sum = num.multiply(num2);
        }
        String answer = sum.toString();
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}