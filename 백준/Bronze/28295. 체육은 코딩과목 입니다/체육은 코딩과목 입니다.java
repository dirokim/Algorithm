import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num = 0;
        while((input = br.readLine()) != null){
            num += Integer.parseInt(input);
        }
        num = num * 90;
        num = num % 360;
        if(num == 0){
            bw.write("N");
        }else if(num == 90){
            bw.write("E");
        }else if(num == 180){
            bw.write("S");
        }else if(num == 270){
            bw.write("W");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}