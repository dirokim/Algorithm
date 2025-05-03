import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        if(input.contains("7") && num % 7 == 0){
            bw.write("3");
        }else if(input.contains("7") && num % 7 != 0){
            bw.write("2");
        }else if(!input.contains("7") && num % 7 == 0){
            bw.write("1");
        }else if(!input.contains("7") && num % 7 != 0){
            bw.write("0");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}