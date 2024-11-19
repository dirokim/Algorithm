import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        if(num % 2 == 0){
            bw.write("SK");
        }else if(num % 2 == 1){
            bw.write("CY");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}