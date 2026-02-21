import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        input = input.substring(0,1);
        if(input.equals("F")){
            bw.write("Foundation");
        }else if(input.equals("C")){
            bw.write("Claves");
        }else if(input.equals("V")){
            bw.write("Veritas");
        }else if(input.equals("E")){
            bw.write("Exploration");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}