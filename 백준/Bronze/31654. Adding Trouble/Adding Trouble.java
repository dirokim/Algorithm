import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        if(num == num2){
            bw.write("correct!");
        }else{
            bw.write("wrong!");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}