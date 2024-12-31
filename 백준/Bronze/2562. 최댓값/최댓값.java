import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num  = 0;
        int num2 = 0;
        int num3 = 0;
        while((input = br.readLine()) != null){
            num2++;
            if(Integer.parseInt(input) > num){
               num = Integer.parseInt(input);
               num3 = num2;
            }
        }
        bw.write(""+num+"\n"+num3);
        br.close();
        bw.flush();
        bw.close();
	} 
}