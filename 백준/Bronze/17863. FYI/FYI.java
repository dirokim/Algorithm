import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        if(input.startsWith("555")){
            bw.write("YES");
        }else{
            bw.write("NO");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}