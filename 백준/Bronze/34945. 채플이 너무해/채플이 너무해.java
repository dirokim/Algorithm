import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        if(num >= 6){
            bw.write("Success!");
        }else{
            bw.write("Oh My God!");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}