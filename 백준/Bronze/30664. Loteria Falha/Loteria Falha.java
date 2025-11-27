import java.io.*; 
import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        BigInteger num = new BigInteger("0");
        while((input = br.readLine()) != null){
            if(input.equals("0")) break;
            num = new BigInteger(input);
            if(num.mod(BigInteger.valueOf(42)).equals(BigInteger.ZERO)){
                bw.write("PREMIADO\n");
            }else{
                bw.write("TENTE NOVAMENTE\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}