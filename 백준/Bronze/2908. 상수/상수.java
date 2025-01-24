import java.io.*; 
import java.util.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder(st.nextToken()).reverse();
        StringBuilder sb2 = new StringBuilder(st.nextToken()).reverse();
        int num  = Integer.parseInt(""+sb);
        int num2 = Integer.parseInt(""+sb2);
        if(num > num2){
            bw.write(""+num);
        }else{
            bw.write(""+num2);
        }
        br.close();
        bw.flush();
        bw.close();
	} 
}