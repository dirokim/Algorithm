import java.io.*; 
import java.util.*;
import java.math.BigInteger;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger num = new BigInteger(st.nextToken());
        BigInteger num2 = new BigInteger(st.nextToken());
        BigInteger answer = num.divide(num2);
        BigInteger answer2 = num.mod(num2);
        bw.write(""+answer+"\n"+answer2);
        br.close();
        bw.flush();
        bw.close();
	} 
}