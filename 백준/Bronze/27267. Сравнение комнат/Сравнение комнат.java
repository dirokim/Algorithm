import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int val = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        int val2 = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        if(val == val2){
            bw.write("E");
        }else if(val > val2){
            bw.write("M");
        }else if(val2 > val){
            bw.write("P");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}