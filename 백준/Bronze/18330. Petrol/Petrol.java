import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int use = Integer.parseInt(br.readLine());
        int limit = Integer.parseInt(br.readLine())+60;
        int answer = 0;
        if(use <= limit){
            answer = use * 1500;
        }else{
            answer = ((use - limit)*3000) + (limit * 1500);
        }
        bw.write(""+answer);
        br.close();
        bw.flush();
        bw.close();
	} 
}