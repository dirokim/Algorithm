import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = br.readLine();
        bw.write(input.substring(input.length()-5,input.length()));
        br.close();
        bw.flush();
        bw.close();
	} 
}