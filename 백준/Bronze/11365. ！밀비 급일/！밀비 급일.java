import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = ""; 
        String sum = "";
        while((input = br.readLine()) != null){
            sum = ""; 
            sum += new StringBuilder(input).reverse().toString();
            if(sum.equals("DNE"))break;
            bw.write(sum+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}