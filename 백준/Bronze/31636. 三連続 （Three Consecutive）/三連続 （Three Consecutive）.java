import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = br.readLine();
        if(input.contains("ooo")){
            bw.write("Yes");
        }else{
            bw.write("No");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}