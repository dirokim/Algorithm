import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int sum = 1;
        while(num > 0){ 
            bw.write("Hello World, Judge "+sum+"!"+"\n");
            num--;
            sum++;
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}