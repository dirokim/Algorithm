import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        num = num * 5 - 400;
        bw.write(""+num+"\n");
        if(num == 100){
            bw.write("0");
        }else if(num > 100){
            bw.write("-1");
        }else if(num < 100){
            bw.write("1");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}