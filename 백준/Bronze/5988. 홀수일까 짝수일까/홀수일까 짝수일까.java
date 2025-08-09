import java.io.*; 
import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        while((input = br.readLine()) != null){
            BigInteger num = new BigInteger(input);
            if(num.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)){
                bw.write("even\n");
            }else{
                bw.write("odd\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}