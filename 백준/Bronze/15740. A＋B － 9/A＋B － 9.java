import java.io.*; 
import java.util.*;
import java.math.BigInteger;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input," ");
        BigInteger num  = new BigInteger(st.nextToken());
        BigInteger num2 = new BigInteger(st.nextToken());
        BigInteger sum  = num.add(num2);
        String answer = ""+sum;
        bw.write(answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}