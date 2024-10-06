import java.io.*;
import java.util.StringTokenizer;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int num = 0;
        StringTokenizer stt = new StringTokenizer(br.readLine());
        br.close();
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        while(stt.hasMoreTokens()){
            num = Integer.parseInt(stt.nextToken());
            if(num < m){
             bw.write(""+num+" ");   
            }   
        }
        bw.flush();
        bw.close();
	} 
}