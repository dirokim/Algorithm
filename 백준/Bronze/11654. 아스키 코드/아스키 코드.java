import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        char sum = input.charAt(0);
        int num = (int)sum;
        br.close();
        input = ""+num;
        bw.write(input);
        bw.flush();
        bw.close();
	} 
}