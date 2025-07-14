import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        num2 = num2*7;
        if((num+num2) > 30){
            bw.write("0");
        }else{
            bw.write("1");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}

