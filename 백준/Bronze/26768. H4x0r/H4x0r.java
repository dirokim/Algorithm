import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = input.replaceAll("a","4");
        input = input.replaceAll("e","3");
        input = input.replaceAll("i","1");
        input = input.replaceAll("o","0");
        input = input.replaceAll("s","5");
        bw.write(input);
        br.close();
        bw.flush();
        bw.close();
	} 
}