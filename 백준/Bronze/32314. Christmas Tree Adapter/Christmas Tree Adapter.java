import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num2 = Integer.parseInt(st.nextToken())/Integer.parseInt(st.nextToken());
        if(num <= num2){
            bw.write("1");
        }else{
            bw.write("0");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}