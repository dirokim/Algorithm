import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        if(input.equals("M")){
            bw.write("MatKor");
        }else if(input.equals("W")){
            bw.write("WiCys");
        }else if(input.equals("C")){
            bw.write("CyKor");
        }else if(input.equals("A")){
            bw.write("AlKor");
        }else if(input.equals("$")){
            bw.write("$clear");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}