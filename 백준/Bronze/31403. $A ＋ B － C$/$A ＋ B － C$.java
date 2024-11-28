import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int first = a+b-c;
        input = ""+a+b;
        int second = Integer.parseInt(input) - c;
        bw.write(""+first+"\n");
        bw.write(""+second+"\n");
        br.close();
        bw.flush();
        bw.close();
	} 
}