import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int num = Integer.parseInt(st.nextToken())*3;
        int val = Integer.parseInt(st.nextToken());
        if(num <= val){
            bw.write("0");
        }else{
            num = num - val;
            num = num * Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write(""+num);
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}