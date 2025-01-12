import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        String sum = "";
        while(input.length() >= 10){
            sum = input.substring(0,10);
            input = input.substring(10,input.length());
            bw.write(sum+"\n");
        }
        if(input.length() > 0){
            bw.write(input);
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}