import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine())*3;
        num += Integer.parseInt(br.readLine())*2;
        num += Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine())*3;
        num2 += Integer.parseInt(br.readLine())*2;
        num2 += Integer.parseInt(br.readLine());
        if(num == num2){
            bw.write("T");
        }else if(num > num2){
            bw.write("A");
        }else if(num2 > num){
            bw.write("B");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}