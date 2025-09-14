import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine())+Integer.parseInt(br.readLine());
        if(num > Integer.parseInt(br.readLine())){
            bw.write("0");
        }else{
            bw.write("1");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}