import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String sum = new StringBuilder(input).reverse().toString();
        if(input.equals(sum)){
            bw.write("1");
        }else{
            bw.write("0");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}