import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String sum = "";
        String sum2= "";
        for(int i=0;i<num;i++){
            sum += "@@@@@";
        }
        for(int i=0;i<num;i++){
            bw.write(sum + "\n");
        }
        for(int i=0;i<num;i++){
            sum2 +="@";
        }
        for(int i=0;i<num * 4;i++){
            bw.write(sum2+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}