import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String input = "";
        int num = 0;
        while((input = br.readLine()) != null){
            if(input.equals("W")){
                num++;
            }
        }
        if(num >= 5){
            bw.write("1");
        }else if(num > 2 && num < 5){
            bw.write("2");
        }else if(num > 0 && num < 3){
            bw.write("3");
        }else{
            bw.write("-1");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}