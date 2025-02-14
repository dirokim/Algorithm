import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        if(num2 >= num){
            bw.write("high speed rail");
        }else{
            bw.write("flight");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}