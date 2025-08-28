import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int num2 = 0;
        String val = "";
        String val2= "";
        String answer = "";
        for(int i=0;i<num;i++){
            num2++;
            val = br.readLine();
            val2 = br.readLine();
            answer = "Case "+num2+": "+val2+", "+val;
            bw.write(answer+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}