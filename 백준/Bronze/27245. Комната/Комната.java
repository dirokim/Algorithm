import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int val = Integer.parseInt(br.readLine());
        int val2 = Integer.parseInt(br.readLine());
        int val3 = Integer.parseInt(br.readLine());
        int chk = 0;
        if(val <= val2){
            if(val / val3 >= 2){
                chk++;
            }
            if(val /val2 <= 2){
                chk++;
            }
        }else{
            if(val2 / val3 >= 2){
                chk++;
            }
            if(val2 /val <= 2){
                chk++;
            }
        }
        if(chk == 2){
            bw.write("good");
        }else{
            bw.write("bad");   
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}