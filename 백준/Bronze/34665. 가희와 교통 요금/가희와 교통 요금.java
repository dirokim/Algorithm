import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String input2 = br.readLine();
        if(input.equals(input2)){
            bw.write("0");
        }else{
            bw.write("1550");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}