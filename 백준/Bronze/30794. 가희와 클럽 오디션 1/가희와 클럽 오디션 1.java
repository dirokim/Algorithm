import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken());
        String sum = st.nextToken();
        int answer = 0;
        if(sum.equals("miss")){
            answer = 0;
        }else if(sum.equals("bad")){
            answer = num * 200;
        }else if(sum.equals("cool")){
            answer = num * 400;
        }else if(sum.equals("great")){
            answer = num * 600;
        }else if(sum.equals("perfect")){
            answer = num * 1000;
        }
        bw.write(""+answer); 
        br.close();
        bw.flush();
        bw.close();
	} 
}