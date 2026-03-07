import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int chk = 0; 
        if(input.contains("D2")){
            chk++;   
        }
        if(input.contains("d2")){
            chk++;   
        }
        if(chk > 0){
            bw.write("D2");   
        }else{
            bw.write("unrated");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}