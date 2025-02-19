import java.io.*; 
import java.util.*;
import java.math.BigInteger;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        BigInteger input = new BigInteger(br.readLine());
        BigInteger input2 = new BigInteger(br.readLine());
        BigInteger answer  = input.add(input2);
        BigInteger answer2 = input.subtract(input2);
        BigInteger answer3 = input.multiply(input2);
        bw.write(""+answer+"\n");
        bw.write(""+answer2+"\n");
        bw.write(""+answer3);
        br.close();
        bw.flush();
        bw.close();
	} 
}