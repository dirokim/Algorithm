import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int hongYear = 1946;
        int num  = Integer.parseInt(input);
        hongYear = num - hongYear;
        input = ""+hongYear;
        br.close();
        bw.write(input);
        bw.flush();
        bw.close();
	} 
}