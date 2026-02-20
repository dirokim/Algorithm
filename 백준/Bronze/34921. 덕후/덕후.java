import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int age = Integer.parseInt(st.nextToken());
        int solved = Integer.parseInt(st.nextToken());
        int answer = (25 - age + solved) * 2 + 10;
        if(answer < 0){
            bw.write("0");    
        }else{
            bw.write(""+answer);
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}