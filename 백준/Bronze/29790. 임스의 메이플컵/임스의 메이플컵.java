import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int val = Integer.parseInt(st.nextToken());
        int val2 = Integer.parseInt(st.nextToken());
        int val3 = Integer.parseInt(st.nextToken());
        if(val >= 1000){
            if(val2 >= 8000 || val3 >= 260){
                bw.write("Very Good");
            }else{
                bw.write("Good");
            }
        }else{
            bw.write("Bad");
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}