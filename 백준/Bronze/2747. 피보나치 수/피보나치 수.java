import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        int before = 0;
        int after = 1;
        int result = 0;
        for(int i=2;i<=input;i++){
            result = before + after;
            before = after;
            after = result;
        }
        bw.write(""+after);
        br.close();
        bw.flush();
        bw.close();
	} 
}