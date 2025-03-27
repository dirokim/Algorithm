import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int a = 0;
        int b = 0;
        String answer = "";
        while((input = br.readLine()) != null){
            if(input.equals("***"))break;
            answer = new StringBuilder(input).reverse().toString();
            bw.write(answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}