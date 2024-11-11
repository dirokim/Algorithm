import java.io.*; 
import java.util.*;
import java.math.BigInteger;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        BigInteger num = a.add(b);
        input += ""+num;
        bw.write(input);
        br.close();
        bw.flush();
        bw.close();
	} 
}