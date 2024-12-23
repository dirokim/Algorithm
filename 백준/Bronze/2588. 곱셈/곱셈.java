import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String numA = br.readLine();
        String numB = br.readLine(); 
        int a = Integer.parseInt(numA) * Integer.parseInt(numB.substring(2,3));
        int b = Integer.parseInt(numA) * Integer.parseInt(numB.substring(1,2));
        int c = Integer.parseInt(numA) * Integer.parseInt(numB.substring(0,1));
        long answer = Long.parseLong(numA) * Long.parseLong(numB); 
        bw.write(""+a+"\n");
        bw.write(""+b+"\n");
        bw.write(""+c+"\n");
        bw.write(""+answer+"\n");
        br.close();
        bw.flush();
        bw.close();
	} 
}