import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());
        num2 = num2 * num3;
        if(num <= num2){
            bw.write("yes");
        }else{
            bw.write("no");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}