import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        while(st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken());
        }
        if(sum >= num){
            bw.write("Padaeng_i Happy");
        }else{
            bw.write("Padaeng_i Cry");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}