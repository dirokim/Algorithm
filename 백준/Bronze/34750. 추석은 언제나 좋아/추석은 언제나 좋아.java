import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int mine = 0;
        int take = 0;
        if(num >= 1000000){
            mine = num / 5;
            take = num - mine;
        }else if(num >= 500000){
            mine = num * 15 / 100;
            take = num - mine;
        }else if(num >= 100000){
            mine = num / 10;
            take = num - mine;
        }else{
            mine = num / 20;
            take = num - mine;
        }
        bw.write(""+mine+" "+take);
        br.close();
        bw.flush();
        bw.close();
	} 
}