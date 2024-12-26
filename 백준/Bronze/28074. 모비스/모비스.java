import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        if(input.contains("M")){
            num++;
        }
        if(input.contains("O")){
            num++;
        }
        if(input.contains("B")){
            num++;
        }
        if(input.contains("I")){
            num++;
        }
        if(input.contains("S")){
            num++;
        }
        if(num == 5){
            bw.write("YES");
        }else{
            bw.write("NO");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}