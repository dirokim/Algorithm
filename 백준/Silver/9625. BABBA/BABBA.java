import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        int numA = 0;
        int numB = 1;
        int result = 0;
        for(int i=2;i<=input;i++){
            result = numA + numB;
            numA = numB;
            numB = result;
        }
        bw.write(""+numA+" "+numB);
        br.close();
        bw.flush();
        bw.close();
	} 
}