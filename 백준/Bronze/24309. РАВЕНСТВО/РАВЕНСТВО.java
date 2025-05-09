import java.io.*; 
import java.util.*;
import java.math.BigInteger;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        BigInteger c = new BigInteger(br.readLine());
        BigInteger bc = b.subtract(c);
        BigInteger answer = bc.divide(a);
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}