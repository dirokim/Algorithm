import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = br.readLine();
        int num = 0;
        int yonsei = 0;
        int korea = 0;
        while((input = br.readLine()) != null){
            num++;
            if(input.equals("yonsei")) yonsei = num;
            if(input.equals("korea")) korea = num;
        }
        if(yonsei < korea){
            bw.write("Yonsei Won!");
        }else{
            bw.write("Yonsei Lost...");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}